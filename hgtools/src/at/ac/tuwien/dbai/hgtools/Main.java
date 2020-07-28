package at.ac.tuwien.dbai.hgtools;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		String type = args[0];
		for (int i = 0; i < args.length - 1; i++)
			args[i] = args[i + 1];
		if (type.equals("-sql")) {
			MainSQL.main(Arrays.copyOf(args, args.length - 1));
		} else if (type.equals("-csp")) {
			MainCSP.main(Arrays.copyOf(args, args.length - 1));
		} else if (type.equals("-convert")) {
			String format = args[0];
			for (int i = 0; i < args.length - 1; i++)
				args[i] = args[i + 1];
			if (format.equals("-sql")) {
				MainConvertSQL.main(Arrays.copyOf(args, args.length - 2));
			} else if (format.equals("-csp")) {
				MainConvertCSP.main(Arrays.copyOf(args, args.length - 2));
			}
		} else if (type.equals("-extract")) {
			String format = args[0];
			for (int i = 0; i < args.length - 1; i++)
				args[i] = args[i + 1];
			if (format.equals("-sql")) {
				MainExtractSQL.main(Arrays.copyOf(args, args.length - 2));
			} else if (format.equals("-csp")) {
				// MainConvertCSP.main(Arrays.copyOf(args, args.length - 2));
			}
		} else if (type.equals("-translate")) {
			String format = args[0];
			for (int i = 0; i < args.length - 1; i++)
				args[i] = args[i + 1];
			if (format.equals("-h2p")) {
				MainTranslateHbToPace.main(Arrays.copyOf(args, args.length - 2));
			}
		} else if (type.equals("-makeQuery")) {
			String format = args[0];
			for (int i = 0; i < args.length - 1; i++)
				args[i] = args[i + 1];
			if (format.equals("-sql")) {
				MainMakeQuery.main(Arrays.copyOf(args, args.length - 2));
			}
		} else if (type.equals("-countStmts")) {
			String format = args[0];
			for (int i = 0; i < args.length - 1; i++)
				args[i] = args[i + 1];
			if (format.equals("-sql")) {
				MainCountStmts.main(Arrays.copyOf(args, args.length - 2));
			}
		} else if (type.equals("-checkParser")) {
			String format = args[0];
			for (int i = 0; i < args.length - 1; i++)
				args[i] = args[i + 1];
			if (format.equals("-sql")) {
				MainCheckParser.main(Arrays.copyOf(args, args.length - 2));
			}
		} else if (type.equals("-stats")) {
			MainStats.main(Arrays.copyOf(args, args.length - 1));
		} else if (type.equals("-mergeStats")) {
			MainMergeStats.main(Arrays.copyOf(args, args.length - 1));
		} else if (type.equals("-checkTable")) {
			MainCheckTable.main(Arrays.copyOf(args, args.length - 1));
		} else if (type.equals("-makeStatsTable")) {
			MainMakeStatsTable.main(Arrays.copyOf(args, args.length - 1));
		}
	}

}
