/*
 * Copyright (c) 2019, Huawei Technologies Co. Ltd. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/**
 * @test
 * @summary Tests the correctness of pre loop
 * @library /testlibrary
 * @run main/othervm/timeout=600 TestPreLoop
 */

import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;

public class TestPreLoop {

    public static final int N = 400;

    public static volatile long instanceCount=-1015533768L;
    public static short sFld=10268;
    public static float fFld=-2.839F;
    public long lArrFld[]=new long[N];
    public float fArrFld[]=new float[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i9) {

        float f=1.72F;
        int i10=-7, i11=-10700, i12=11, i13=-160, i14=246, i15=-4618, iArr2[]=new int[N];
        double d1=35.107745;

        FuzzerUtils.init(iArr2, -5);

        TestPreLoop.sFld = (short)f;
        i9 -= i9;
        i9 |= i9;
        for (i10 = 12; i10 < 314; i10++) {
            for (i12 = 1; i12 < 5; i12++) {
                iArr2[i12 + 1] <<= i9;
                TestPreLoop.instanceCount = (long)d1;
                i13 += i12;
                i9 = (int)f;
                iArr2[i12 + 1] &= i12;
                for (i14 = 1; 2 > i14; i14++) {
                    TestPreLoop.sFld -= (short)i12;
                    TestPreLoop.instanceCount += (i14 * i14);
                    i9 += (i14 * TestPreLoop.instanceCount);
                }
                TestPreLoop.instanceCount += i15;
            }
        }
        vMeth2_check_sum += i9 + Float.floatToIntBits(f) + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) + i14 +
            i15 + FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth1(long l, int i4) {

        double d=-125.128624;
        int i5=14, i6=-138, i7=-225, i8=10, i16=-33, i17=-7, i18=56727, i19=1, iArr1[]=new int[N];
        short s1=-19091;

        FuzzerUtils.init(iArr1, 10);

        i4 *= (int)(-((i4 * i4) + (d + i4)));
        for (i5 = 7; i5 < 398; ++i5) {
            for (i7 = 4; 1 < i7; --i7) {
                s1 = (short)((Integer.reverseBytes(i5) + (d * -1)) - Math.min(iArr1[i7], iArr1[(0 >>> 1) % N] += -7));
                vMeth2(-190);
            }
            iArr1[i5 + 1] ^= TestPreLoop.sFld;
            TestPreLoop.instanceCount *= i4;
            i8 += (((i5 * i5) + i6) - i5);
        }
        l += -92;
        for (i16 = 18; i16 < 320; ++i16) {
            for (i18 = 1; i18 < 5; ++i18) {
                i4 += i19;
                i17 = -3;
                i19 += (int)d;
                i19 += (i18 * i18);
            }
        }
        vMeth1_check_sum += l + i4 + Double.doubleToLongBits(d) + i5 + i6 + i7 + i8 + s1 + i16 + i17 + i18 + i19 +
            FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth() {

        int i20=-101;

        vMeth1(8L, i20);
        vMeth_check_sum += i20;
    }

    public void mainTest(String[] strArr1) {

        int i=-25262, i1=-45900, i2=-1, i3=-73, i21=5, i22=14, i23=13, i24=5, i25=2, i26=31667, i27=-28202, iArr[]=new
            int[N];
        byte by=-25;
        short s=5120;
        double d2=68.33497;

        FuzzerUtils.init(iArr, -30813);

        for (i = 11; 20 > i; ++i) {
            for (i2 = 6; i2 < 130; i2++) {
                i3 >>>= (i1 = (--i3));
            }
            i3 += (((i * i2) + by) - i1);
            iArr[i + 1] = (int)((-(TestPreLoop.instanceCount * s)) - (iArr[i + 1]--));
            vMeth();
            iArr[i] = (int)TestPreLoop.instanceCount;
            for (i21 = i; i21 < 130; i21++) {
                lArrFld[i21 + 1] -= (long)TestPreLoop.fFld;
                i1 = -11;
                try {
                    i1 = (i2 % -224);
                    iArr[i - 1] = (i1 / 87);
                    i22 = (41351 / i1);
                } catch (ArithmeticException a_e) {}
                TestPreLoop.instanceCount *= (long)d2;
                lArrFld[i21] %= (i1 | 1);
                for (i23 = 1; i23 < 1; i23++) {
                    i1 *= (int)TestPreLoop.fFld;
                    i22 -= 10;
                    i1 /= (int)((long)(d2) | 1);
                }
                i3 = i1;
            }
            TestPreLoop.sFld += (short)i;
            i25 = 1;
            do {
                i3 >>>= i23;
            } while (++i25 < 130);
            i22 <<= 18742;
        }
        for (i26 = 9; i26 < 14; ++i26) {
            fArrFld[i26 - 1] += TestPreLoop.instanceCount;
            TestPreLoop.instanceCount |= i;
            i22 = -1218;
            d2 -= 112.492F;
            iArr[i26 - 1] += i27;
            d2 = s;
            i27 += i26;
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 by s = " + i3 + "," + by + "," + s);
        FuzzerUtils.out.println("i21 i22 d2 = " + i21 + "," + i22 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 iArr = " + i26 + "," + i27 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("TestPreLoop.instanceCount TestPreLoop.sFld TestPreLoop.fFld = " + TestPreLoop.instanceCount + "," + TestPreLoop.sFld +
				"," + Float.floatToIntBits(TestPreLoop.fFld));
        FuzzerUtils.out.println("lArrFld fArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," +
				Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            TestPreLoop _instance = new TestPreLoop();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
	} catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
	}
    }
}

class FuzzerUtils {

    public static PrintStream out = System.out;
    public static Random random = new Random(1);
    public static long seed = 1L;
    public static int UnknownZero = 0;

    // Init seed
    public static void seed(long seed){
        random = new Random(seed);
        FuzzerUtils.seed = seed;
    }

    public static int nextInt(){
        return random.nextInt();
    }
    public static long nextLong(){
        return random.nextLong();
    }
    public static float nextFloat(){
        return random.nextFloat();
    }
    public static double nextDouble(){
        return random.nextDouble();
    }
    public static boolean nextBoolean(){
        return random.nextBoolean();
    }
    public static byte nextByte(){
        return (byte)random.nextInt();
    }
    public static short nextShort(){
        return (short)random.nextInt();
    }
    public static char nextChar(){
        return (char)random.nextInt();
    }

    // Array initialization

    // boolean -----------------------------------------------
    public static void init(boolean[] a, boolean seed) {
        for (int j = 0; j < a.length; j++) {
            a[j] = (j % 2 == 0) ? seed : (j % 3 == 0);
        }
    }

    public static void init(boolean[][] a, boolean seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }

    // long --------------------------------------------------
    public static void init(long[] a, long seed) {
        for (int j = 0; j < a.length; j++) {
            a[j] = (j % 2 == 0) ? seed + j : seed - j;
        }
    }

    public static void init(long[][] a, long seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }

    // int --------------------------------------------------
    public static void init(int[] a, int seed) {
        for (int j = 0; j < a.length; j++) {
            a[j] = (j % 2 == 0) ? seed + j : seed - j;
        }
    }

    public static void init(int[][] a, int seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }

    // short --------------------------------------------------
    public static void init(short[] a, short seed) {
        for (int j = 0; j < a.length; j++) {
            a[j] = (short) ((j % 2 == 0) ? seed + j : seed - j);
        }
    }

    public static void init(short[][] a, short seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }

    // char --------------------------------------------------
    public static void init(char[] a, char seed) {
        for (int j = 0; j < a.length; j++) {
            a[j] = (char) ((j % 2 == 0) ? seed + j : seed - j);
        }
    }

    public static void init(char[][] a, char seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }

    // byte --------------------------------------------------
    public static void init(byte[] a, byte seed) {
        for (int j = 0; j < a.length; j++) {
            a[j] = (byte) ((j % 2 == 0) ? seed + j : seed - j);
        }
    }

    public static void init(byte[][] a, byte seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }

    // double --------------------------------------------------
    public static void init(double[] a, double seed) {
        for (int j = 0; j < a.length; j++) {
            a[j] = (j % 2 == 0) ? seed + j : seed - j;
        }
    }

    public static void init(double[][] a, double seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }

    // float --------------------------------------------------
    public static void init(float[] a, float seed) {
        for (int j = 0; j < a.length; j++) {
            a[j] = (j % 2 == 0) ? seed + j : seed - j;
        }
    }

    public static void init(float[][] a, float seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }
    // Object -------------------------------------------------

    public static void init(Object[][] a, Object seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }

    public static void init(Object[] a, Object seed) {
        for (int j = 0; j < a.length; j++)
            try {
                a[j] = seed.getClass().newInstance();
            } catch (Exception ex) {
                a[j] = seed;
            }
    }

    // Calculate array checksum

    // boolean -----------------------------------------------
    public static long checkSum(boolean[] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += (a[j] ? j + 1 : 0);
        }
        return sum;
    }

    public static long checkSum(boolean[][] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }

    // long --------------------------------------------------
    public static long checkSum(long[] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += (a[j] / (j + 1) + a[j] % (j + 1));
        }
        return sum;
    }

    public static long checkSum(long[][] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }

    // int --------------------------------------------------
    public static long checkSum(int[] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += (a[j] / (j + 1) + a[j] % (j + 1));
        }
        return sum;
    }

    public static long checkSum(int[][] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }

    // short --------------------------------------------------
    public static long checkSum(short[] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += (short) (a[j] / (j + 1) + a[j] % (j + 1));
        }
        return sum;
    }

    public static long checkSum(short[][] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }

    // char --------------------------------------------------
    public static long checkSum(char[] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += (char) (a[j] / (j + 1) + a[j] % (j + 1));
        }
        return sum;
    }

    public static long checkSum(char[][] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }

    // byte --------------------------------------------------
    public static long checkSum(byte[] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += (byte) (a[j] / (j + 1) + a[j] % (j + 1));
        }
        return sum;
    }

    public static long checkSum(byte[][] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }

    // double --------------------------------------------------
    public static double checkSum(double[] a) {
        double sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += (a[j] / (j + 1) + a[j] % (j + 1));
        }
        return sum;
    }

    public static double checkSum(double[][] a) {
        double sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }

    // float --------------------------------------------------
    public static double checkSum(float[] a) {
        double sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += (a[j] / (j + 1) + a[j] % (j + 1));
        }
        return sum;
    }

    public static double checkSum(float[][] a) {
        double sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }

    // Object --------------------------------------------------
    public static long checkSum(Object[][] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }

    public static long checkSum(Object[] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]) * Math.pow(2, j);
        }
        return sum;
    }

    public static long checkSum(Object a) {
        if (a == null)
            return 0L;
        return (long) a.getClass().getCanonicalName().length();
    }

    // Array creation ------------------------------------------
    public static byte[] byte1array(int sz, byte seed) {
        byte[] ret = new byte[sz];
        init(ret, seed);
        return ret;
    }

    public static byte[][] byte2array(int sz, byte seed) {
        byte[][] ret = new byte[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static short[] short1array(int sz, short seed) {
        short[] ret = new short[sz];
        init(ret, seed);
        return ret;
    }

    public static short[][] short2array(int sz, short seed) {
        short[][] ret = new short[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static int[] int1array(int sz, int seed) {
        int[] ret = new int[sz];
        init(ret, seed);
        return ret;
    }

    public static int[][] int2array(int sz, int seed) {
        int[][] ret = new int[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static long[] long1array(int sz, long seed) {
        long[] ret = new long[sz];
        init(ret, seed);
        return ret;
    }

    public static long[][] long2array(int sz, long seed) {
        long[][] ret = new long[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static float[] float1array(int sz, float seed) {
        float[] ret = new float[sz];
        init(ret, seed);
        return ret;
    }

    public static float[][] float2array(int sz, float seed) {
        float[][] ret = new float[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static double[] double1array(int sz, double seed) {
        double[] ret = new double[sz];
        init(ret, seed);
        return ret;
    }

    public static double[][] double2array(int sz, double seed) {
        double[][] ret = new double[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static char[] char1array(int sz, char seed) {
        char[] ret = new char[sz];
        init(ret, seed);
        return ret;
    }

    public static char[][] char2array(int sz, char seed) {
        char[][] ret = new char[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static Object[] Object1array(int sz, Object seed) {
        Object[] ret = new Object[sz];
        init(ret, seed);
        return ret;
    }

    public static Object[][] Object2array(int sz, Object seed) {
        Object[][] ret = new Object[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static boolean[] boolean1array(int sz, boolean seed) {
        boolean[] ret = new boolean[sz];
        init(ret, seed);
        return ret;
    }

    public static boolean[][] boolean2array(int sz, boolean seed) {
        boolean[][] ret = new boolean[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static AtomicLong runningThreads = new AtomicLong(0);

    public static synchronized void runThread(Runnable r) {
        final Thread t = new Thread(r);
        t.start();
        runningThreads.incrementAndGet();
        Thread t1 = new Thread(new Runnable() {
		public void run() {
		    try {
			t.join();
			runningThreads.decrementAndGet();
		    } catch (InterruptedException e) {
		    }
		}
	    });
        t1.start();
    }

    public static void joinThreads() {
        while (runningThreads.get() > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
