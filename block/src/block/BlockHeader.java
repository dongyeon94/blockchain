package block;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class BlockHeader {

	private byte[] previousBlockHash;
	private int merkleRootHash;

	public BlockHeader(byte[] previousBlockHash, Object[] transactions) {
		this.previousBlockHash = previousBlockHash;
		this.merkleRootHash = this.someMethod(transactions);
	}

	public byte[] toByteArray() {
		String tmpStr = "";
		if (previousBlockHash != null) {
			tmpStr += new String(previousBlockHash, 0, previousBlockHash.length);
		}
		tmpStr += merkleRootHash;
		return tmpStr.getBytes(StandardCharsets.UTF_8);
	}

	private int someMethod(Object[] transations) {
		return Arrays.hashCode(transations);
	}
}