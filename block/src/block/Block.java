package block;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Block {

	private BlockHeader blockHeader;
	private Object[] transactions;

	public Block(BlockHeader blockHeader, Object[] transactions) {
		this.blockHeader = blockHeader;
		this.transactions = transactions;
	}

	public String getBlockHash() throws NoSuchAlgorithmException {
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
		// Hash twice - Not a K-pop girl group.
		byte[] blockHash = messageDigest.digest(blockHeader.toByteArray());
		blockHash = messageDigest.digest(blockHash);
		return new String(blockHash, 0, blockHash.length);
	}

}