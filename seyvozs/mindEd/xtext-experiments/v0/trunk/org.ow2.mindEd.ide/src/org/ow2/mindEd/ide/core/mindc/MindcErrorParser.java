package org.ow2.mindEd.ide.core.mindc;

import org.eclipse.cdt.core.IMarkerGenerator;
import org.eclipse.cdt.core.errorparsers.RegexErrorParser;
import org.eclipse.cdt.core.errorparsers.RegexErrorPattern;

public class MindcErrorParser extends RegexErrorParser {
	
	private static MindcErrorParser instance = null;
	final int WARN=IMarkerGenerator.SEVERITY_WARNING;
	
	public MindcErrorParser() {
		super();
		
		if (instance == null) instance = this;
		
		String pattern = "At (.*?):(\\d+).*?";
		addPattern(new RegexErrorPattern(pattern, "$1", "$2", null, null, WARN, true));
	}

	public static MindcErrorParser getInstance() {
		return instance;
	}
	
}
