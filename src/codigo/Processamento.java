package codigo;

import java.awt.event.ItemEvent;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Processamento {
	
	public void processo() throws SQLException, IOException {
		
		Arquivo arq = new Arquivo();
		
		String sql = arq.lerSql();
		Conexao.executaSql(sql);


  }//fim função
	
}//fim classe
