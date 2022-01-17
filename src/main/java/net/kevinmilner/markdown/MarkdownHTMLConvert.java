package net.kevinmilner.markdown;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import org.opensha.commons.util.MarkdownUtils;

import com.google.common.base.Preconditions;
import com.google.common.io.Files;

public class MarkdownHTMLConvert {

	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			System.err.println("USAGE: <input-file.md> <output-file.html>");
			System.exit(1);
		}
		File input = new File(args[0]);
		Preconditions.checkState(input.exists(), "Input markdown file doesn't exist: %s", input);
		File output = new File(args[1]);
		
		System.out.println("Reading markdown from "+input.getAbsolutePath());
		List<String> lines = Files.readLines(input, Charset.defaultCharset());
		
		System.out.println("Read "+lines.size()+" lines");
		
		System.out.println("Writing HTML to "+output.getAbsolutePath());
		
		MarkdownUtils.writeHTML(lines, output);
		
		System.out.println("DONE");
		System.exit(0);
	}
}
