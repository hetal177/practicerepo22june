package resources.testdata;

import org.testng.annotations.DataProvider;



    public class TestData {

        @DataProvider(name = "JobSearchData")
        public Object[][] getData() {
            String[][] data = new String[][]{
                    {"Tester", "Harrow", "5"} //"30000", "500000", "per annum", "Permanent", "permanent Tester", "Permanent Tester jobs in Harrow on the Hill"},
                    //  {"BioMedical Scientist","Euston","up to 10 mlie","40000","70000","Per Month","Contract","Contract Biomedical Scientist jobs in Euston"},
                    // {"Lead Engineer","London","up to 25 Miles","3500","5000","Per week","Temporary","Temporary Lead Engineer jobs in London"}
            };

            return data;


        }
    }

