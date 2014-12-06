/**
 * 
 */
package app;
import java.io.File;
import java.util.Scanner;

import utils.FetchURLs;
import utils.RetrieveFTP;


/**
 * @author billy
 *
 */
public class EntranceApp {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		new App();
		//FetchURLs fu = new FetchURLs("http://www.ncbi.nlm.nih.gov", "ftp.ncbi.nlm.nih.gov");
		//fu.init("/genomes/GENOME_REPORTS/");
		//fu.setOrganizedJson("sort_output.json");
		//fu.completeUrls();
	}


}
