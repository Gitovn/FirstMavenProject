package dataprovider;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import samplepackage.ExcelHelper;

public class DataProviderClass2 {

	// array list
	// =============================================================================

	@DataProvider(name = "getKeyValueFromArrayList")
	public String[][] provideKeyValuePair1() {

		ExcelHelper exHelp = new ExcelHelper("KTCTC.xlsx", "Oct");
		ArrayList<String> keys = exHelp.getKeysListFromExcel();
		ArrayList<String> values = exHelp.getValuesListFromExcel();
		String[][] data = new String[keys.size()][2];

		for (int i = 0; i < keys.size(); i++) {

			data[i][0] = keys.get(i);
			data[i][1] = values.get(i);

		}

		return data;
	}

	@Test(dataProvider = "getKeyValueFromArrayList")
	public void verifyTextBoxAcceptsTheKeyValue(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}

}
