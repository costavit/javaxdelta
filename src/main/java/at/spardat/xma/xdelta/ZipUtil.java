package at.spardat.xma.xdelta;

import java.util.zip.ZipEntry;

public class ZipUtil {
	public static ZipEntry cloneZipEntry(ZipEntry targetEntry) {
		ZipEntry outputEntry = new ZipEntry(targetEntry.getName());
		//                        flag = e.flag;
		outputEntry.setTime(targetEntry.getTime());
		outputEntry.setCrc(targetEntry.getCrc());
		outputEntry.setSize(targetEntry.getSize());
//		outputEntry.setCompressedSize(targetEntry.getCompressedSize());
		outputEntry.setMethod(targetEntry.getMethod());
		outputEntry.setExtra(targetEntry.getExtra());
		outputEntry.setComment(targetEntry.getComment());
		return outputEntry;
	}
}
