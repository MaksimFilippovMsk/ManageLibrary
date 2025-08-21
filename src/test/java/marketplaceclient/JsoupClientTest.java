package marketplaceclient;

import org.junit.jupiter.api.Test;

public class JsoupClientTest {

    @Test
    public void sendRequestTest(){
       JsoupClient jsoupClient = new JsoupClient();
        BookResult bookResult = jsoupClient.sendRequest("https://market.yandex.ru/card/zamok-kafka-f/103658473418?do-waremd5=q2i6Bx_0Bv4VLHjJ4NaxWg&sponsored=1&cpc=wZCUfHjI29Lwn-yMYR3us0YXEiLyW1Rv4YTg8Kh7hGsaJ3_cf40YFoRzgGPBQKpdo5ud9gXMSENMQH8rT5X0AE_1SnCpp8TB82gAWbjX3HV7LckKToyLksEgJWlRuuBuY5o-R0q0hrjWypFznZv5lUwHXrCp-1zDYsiEOOoHM6GC4aWyP2KW4T_UQha-VQKaGh-uzR4_7sVHoZHdk1M0_O48GVzfiNRynBQ6Fz1jXwrLal3qVWLsUtdmYUSkJZpkHMsnx2mOwHVopuC_MfBCeh5zNeWlGn_VQBkkXCErVT_-cQE2fm7WiDIFJVbdmwbanWJQ37cB6ER1nCA3NhJSahxH6GDwglInWprGxwpVFJNmVR4NRqyNnQWlufVhDAEcL4JTFbisdYlg-Xvt3fuK52ciVUKXfAqnmgotFx0lerOfDGDlVZMDt1rPknnsLqMRCkNkf8JbgCJOlcU6cGILMAtpZaF_pnNIkdDK9rIH_gbIsWGT4sg4inXDreBdhUhz7ImnEsbaCCyuPKOtiyL7bMfoQoN1QhJG9LKoRGbWTJkhRSNZBWeqWesDzKTtzFT3lF7nrJtxLupseD4sAa1Z7WfuZYhAcXu7Gwoiqdf40Rk%2C&nid=20598910",
                "Гранатовый браслет"
                );
        System.out.println(bookResult);
    }

}
