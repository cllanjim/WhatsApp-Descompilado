package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class PKCS5S2ParametersGenerator extends PBEParametersGenerator {
    public static boolean a;
    private static final String z;
    private Mac hMac;
    private byte[] state;

    static {
        char[] toCharArray = "PK[\u001b\bMVQ\u0007IZPK\u0007\u001d\u0019RK\u001a\u001d\u0019][I\bM\u001fR\f\bJK\u001eXG".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 57;
                    break;
                case ay.f /*1*/:
                    i2 = 63;
                    break;
                case ay.n /*2*/:
                    i2 = 62;
                    break;
                case ay.p /*3*/:
                    i2 = 105;
                    break;
                default:
                    i2 = 105;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public CipherParameters generateDerivedParameters(int i) {
        int i2 = i / 8;
        return new KeyParameter(generateDerivedKey(i2), 0, i2);
    }

    private void F(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2) {
        boolean z = a;
        if (i == 0) {
            try {
                throw new IllegalArgumentException(z);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        if (bArr != null) {
            try {
                this.hMac.update(bArr, 0, bArr.length);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        this.hMac.update(bArr2, 0, bArr2.length);
        this.hMac.doFinal(this.state, 0);
        System.arraycopy(this.state, 0, bArr3, i2, this.state.length);
        int i3 = 1;
        while (i3 < i) {
            this.hMac.update(this.state, 0, this.state.length);
            this.hMac.doFinal(this.state, 0);
            int i4 = 0;
            while (i4 != this.state.length) {
                int i5 = i2 + i4;
                bArr3[i5] = (byte) (bArr3[i5] ^ this.state[i4]);
                i4++;
                if (z) {
                    break;
                }
            }
            i4 = i3 + 1;
            if (!z) {
                i3 = i4;
            } else {
                return;
            }
        }
    }

    public PKCS5S2ParametersGenerator(Digest digest) {
        boolean z = a;
        this.hMac = new HMac(digest);
        this.state = new byte[this.hMac.getMacSize()];
        if (BaseKeyGenerator.a) {
            a = !z;
        }
    }

    public CipherParameters generateDerivedParameters(int i, int i2) {
        boolean z = false;
        boolean z2 = a;
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] generateDerivedKey = generateDerivedKey(i3 + i4);
        try {
            CipherParameters parametersWithIV = new ParametersWithIV(new KeyParameter(generateDerivedKey, 0, i3), generateDerivedKey, i3, i4);
            if (z2) {
                if (!BaseKeyGenerator.a) {
                    z = true;
                }
                BaseKeyGenerator.a = z;
            }
            return parametersWithIV;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private byte[] generateDerivedKey(int i) {
        boolean z = a;
        int macSize = this.hMac.getMacSize();
        int i2 = ((i + macSize) - 1) / macSize;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[(i2 * macSize)];
        int i3 = 0;
        this.hMac.init(new KeyParameter(this.password));
        int i4 = 1;
        while (i4 <= i2) {
            int i5 = 3;
            do {
                byte b = (byte) (bArr[i5] + 1);
                bArr[i5] = b;
                if (b != null) {
                    break;
                }
                i5--;
            } while (!z);
            F(this.salt, this.iterationCount, bArr, bArr2, i3);
            i3 += macSize;
            i5 = i4 + 1;
            if (z) {
                break;
            }
            i4 = i5;
        }
        return bArr2;
    }

    public CipherParameters generateDerivedMacParameters(int i) {
        return generateDerivedParameters(i);
    }
}
