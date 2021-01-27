package codigo;

import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Arquivo {

	public String lerArquivo() throws IOException  {
		String dir = System.getProperty("user.dir");
		FileReader arq = new FileReader(dir + "\\ip.txt");
		BufferedReader lerArq = new BufferedReader(arq);
		String linha = lerArq.readLine();
		return linha;
		
	}
	public String lerSql() throws IOException  {
		String dir = System.getProperty("user.dir");
		
		LineNumberReader lnr = new LineNumberReader(new FileReader(dir + "\\sql.txt"));
		lnr.skip(Long.MAX_VALUE);
		int retorno = lnr.getLineNumber();
		lnr.close();
		

		FileReader arq = new FileReader(dir + "\\sql.txt");
		BufferedReader lerArq = new BufferedReader(arq);
		
		String linha = null;
		for(int i = 0; i < retorno; i++) {
			if (i == 0) {
				linha = (lerArq.readLine());
				continue;
			}
			linha = linha + (lerArq.readLine());
		}

		return linha;
		
	}
	
}
