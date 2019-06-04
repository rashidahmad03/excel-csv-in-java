package MSwordtojava.msexltojava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CSVfiles {
	public static void main(String... s) throws FileNotFoundException, IOException {

		CSVParser parser = new CSVParser(new FileReader("C:/Users/Ahmadra/Downloads/delete_results20190522084838.csv"),
				CSVFormat.DEFAULT);
		List<CSVRecord> list = parser.getRecords();

		for (CSVRecord record : list) {
			System.out.println(record.get(0));
			String[] arr = new String[record.size()];
			int i = 0;
			for (String str : record) {
				arr[i++] = str;
			}

			parser.close();
			// for (String a : arr)
			// System.out.println(a);
		}
	}

}
