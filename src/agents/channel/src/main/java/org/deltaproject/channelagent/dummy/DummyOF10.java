package org.deltaproject.channelagent.dummy;

public class DummyOF10 {
	final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();

	public static String bytesToHex(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];
		for (int j = 0; j < bytes.length; j++) {
			int v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		return new String(hexChars);
	}

	public static byte[] hexStringToByteArray(String s) {
		int len = s.length();
		byte[] data = new byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
		}
		return data;
	}
	
	public static final String FEATURE_REPLY = "010600b0fffffffe000000000000000100000100fe000000000000c700000ffffffec221c90f9b4b733100000000000000000000000000000000000100000001000000000000000000000000000000000001eaa7286227fd73312d657468310000000000000000000000000000000001000000c00000000000000000000000000002fe4432d0e10b73312d657468320000000000000000000000000000000000000000c0000000000000000000000000";
	public static final String GET_CONFIG_REPLY = "0108000cfffffffb0000ffff";
	public static final String STATS_REPLY = "0111042cfffffffa000000004e69636972612c20496e632e000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004f70656e207653776974636800000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000322e352e3000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004e6f6e65000000000000000000000000000000000000000000000000000000004e6f6e65000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";
	public static final String experimenter = "0104001400000001000023200000000b00000001";
	//public static final String PACKET_IN = "010a003c00000000ffffffff002a00010000ffffffffffff1a0b2b8b2d23080600010800060400011a0b2b8b2d230a0000010000000000000a000002";


	public static final String packetin_arp_req = "010a003c00000000ffffffff002a00010100ffffffffffff5ae47e35609b080600010800060400015ae47e35609b0a0000010000000000000a000002";
	public static final String packetin_arp_res = "010a003c00000000ffffffff002a000201005ae47e35609b766f9d072a2108060001080006040002766f9d072a210a0000025ae47e35609b0a000001";

	public static final String packetin_ping_req = "010a007400000000ffffffff006200010100766f9d072a215ae47e35609b080045000054f46e4000400132380a0000010a0000020800783643cf00019943cd5700000000128b040000000000101112131415161718191a1b1c1d1e1f202122232425262728292a2b2c2d2e2f3031323334353637";
	public static final String packetin_ping_res = "010a007400000000ffffffff0062000201005ae47e35609b766f9d072a21080045000054de8700004001881f0a0000020a0000010000803643cf00019943cd5700000000128b040000000000101112131415161718191a1b1c1d1e1f202122232425262728292a2b2c2d2e2f3031323334353637";

        // IS893
        public static final String HELLO = "0100000800000000";
        public static final String ERROR = "010100180000000c000100010114000c0000000c00010000";
        public static final String ECHO_RESPONSE = "0103000800000000";
	public static final String VENDOR = "0104001400000001000023200000000b00000001";
	public static final String FEATURE_RESPONSE = "010600b0fffffffe000000000000000100000100fe000000000000c700000ffffffec221c90f9b4b733100000000000000000000000000000000000100000001000000000000000000000000000000000001eaa7286227fd73312d657468310000000000000000000000000000000001000000c00000000000000000000000000002fe4432d0e10b73312d657468320000000000000000000000000000000000000000c0000000000000000000000000";
	public static final String GET_CONFIG_RESPONSE = "0108000cfffffffb0000ffff";
	public static final String PACKET_IN = "010a003c00000000ffffffff002a00010000ffffffffffff1a0b2b8b2d23080600010800060400011a0b2b8b2d230a0000010000000000000a000002";
        public static final String FLOW_REMOVED = "010b005800000000001000000001000000000001000000000002ffff00000800000100000a0000010a000002000800000000000000000000ffff0000000000132f443840000a000000000000000000030000000000000126";
        public static final String PORT_STATUS = "010c00400000000002000000000000000001ce06896aeb4573312d657468310000000000000000000000000000000001000000c0000000000000000000000000";
	public static final String STATS_RESPONSE = "0111042cfffffffa000000004e69636972612c20496e632e000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004f70656e207653776974636800000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000322e352e3000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004e6f6e65000000000000000000000000000000000000000000000000000000004e6f6e65000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";
        public static final String BARRIER_RESPONSE = "0113000800000000";
        public static final String QUEUE_GET_CONFIG_RESPONSE = "0115_LEN_XID_BODY";

}