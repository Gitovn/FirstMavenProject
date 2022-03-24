package dataprovider;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import samplepackage.ExcelHelper;

public class DataProviderClass {

	@DataProvider(name = "getData")
	public String[] provideData() {
		String[] data = { "HI", "Hello", "KTCTC" };
		return data;
	}

	@Test(dataProvider = "getData")
	public void verifyTextBoxAcceptsTheString(String ab) {
		System.out.println(ab);
	}

	// Hashmap
	// =================================================================================

	@DataProvider(name = "getKeyValueFromHashMap")
	public String[][] provideKeyValuePair() {

		ExcelHelper exHelp = new ExcelHelper("KTCTC.xlsx", "Oct");
		HashMap<String, String> hashData = exHelp.getKeyValuePairFromExcel();
		String[][] data = new String[hashData.size()][2];
		int i = 0;

		for (Entry<String, String> each : hashData.entrySet()) {
			data[i][0] = each.getKey();
			data[i][1] = each.getValue();
			i++;
		}
		return data;
	}

	@Test(dataProvider = "getKeyValueFromHashMap")
	public void verifyTextBoxAcceptsTheKeyValuePair(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}

}
