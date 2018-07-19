package block;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hosang on 2017. 12. 2..
 */
public class BlockchainDriver {
	List<Block> blockchain = new ArrayList<Block>();

	int VOTE1;
	int VOTE2;

	public static void main(String[] args) throws NoSuchAlgorithmException {

		// block1
		String[] transactions1 = { "A Vote to VOTE1 Send 1coin to A" };
		Block Block1 = new Block(new BlockHeader(null, transactions1), transactions1);
		System.out.println("VOTE1: 1 , VOTE2: 0   hash: " + Block1.getBlockHash());

		// block2
		String[] Transactions2 = { "B Vote to VOTE1 Send 1coin to B" };
		Block Block2 = new Block(new BlockHeader(Block1.getBlockHash().getBytes(), Transactions2), Transactions2);
		System.out.println("VOTE1: 2 , VOTE2: 0   hash: " + Block2.getBlockHash());

		// block3
		String[] Transactions3 = { "C Vote to VOTE2 Send 1coin to C" };
		Block Block3 = new Block(new BlockHeader(Block2.getBlockHash().getBytes(), Transactions3), Transactions3);
		System.out.println("VOTE1: 2 , VOTE2: 1   hash: " + Block3.getBlockHash());

		// block4
		String[] Transactions4 = { "D Vote to VOTE1 Send 1coin to D" };
		Block Block4 = new Block(new BlockHeader(Block3.getBlockHash().getBytes(), Transactions4), Transactions4);
		System.out.println("VOTE1: 3 , VOTE2: 1   hash: " + Block4.getBlockHash());

		// block5
		String[] Transactions5 = { "E Vote to VOTE1 Send 1coin to E" };
		Block Block5 = new Block(new BlockHeader(Block4.getBlockHash().getBytes(), Transactions5), Transactions5);
		System.out.println("VOTE1: 4 , VOTE2: 1   hash: " + Block5.getBlockHash());

	}
}