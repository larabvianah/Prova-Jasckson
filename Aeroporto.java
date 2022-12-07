import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Aeroporto {
    public static void main(String[] args) throws Exception {
        int op;
        Scanner scanner = new Scanner(System.in);

        do{ 
        System.out.println("");
        System.out.println("Escolha a Opção: ");
        System.out.println("1 - Cadastrar Companhia");
        System.out.println("2 - Listar Companhia");

        System.out.println("7 - Cadastrar/Listar/Excluir Aeromodelo");
     
        System.out.println("5 - Cadastrar Hangar");
        System.out.println("6 - Listar Hangar");
        System.out.println("20 - Cadastrar Pista");
        System.out.println("22 - Listar Pista");

        op = scanner.nextInt();
        int op2;
        int op3;
        switch (op) {
            case 1:
            try {
        
                System.out.println("Digite o nome da empresa: ");
                String nome = scanner.next();
                System.out.println("Digite o CNPJ da empresa: ");
                String cnpj = scanner.next();
                
                new Companhia(nome,cnpj);
            } catch (Exception e) {
                System.out.println("Erro ao cadastrar companhia. " + e.getMessage());
            }
                break;
            
            case 2 :
                try {
                    Connection conexao = DAO.createConnection();;
                    String query = "select ID_COMPANHIA,NOME,CNPJ from COMPANHIA;";
                    PreparedStatement stmt = conexao.prepareStatement(query);
			        ResultSet rs = stmt.executeQuery(query);
                    System.out.println("ID -- NOME  --  CNPJ" + "\n" +
                                       "--------------------");
			        while (rs.next()) {
                    String id = rs.getString(1);
                    String nome = rs.getString(2);
				    String cnpj = rs.getString(3);
				  
				    
				    System.out.print(id+ " | " + nome + " | ");
				    System.out.println(cnpj);
				     
			}
            DAO.closeConnection();
			rs.close();
                 
                } catch (Exception e) {
                    System.out.println("Erro ao listar companhia. " + e.getMessage());
                }
                    break;
                case 7:
                System.out.println("Digite o tipo de aeromodelo");
                System.out.println("[1] aviao");
                System.out.println("[2] helicotero");
                System.out.println("[3] jato");
                int op_aero =scanner.nextInt();
                
                    
                if(op_aero == 1) {
                    System.out.println("Escolha uma opção");
                    System.out.println("[3] Cadastrar avião");
                    System.out.println("[4] listar avião");
                    System.out.println("[5] excluir avião");
                    op = scanner.nextInt();
                switch (op) {
                case 3:
                    try {
                        System.out.println("Digite a marca do avião: ");
                        String marca = scanner.next();
                        System.out.println("Digite o modelo do avião: ");
                        String modelo = scanner.next();
                        System.out.println("Digite a capacidade avião: ");
                        int capa = scanner.nextInt();
                        System.out.println("Digite o prefixo do avião: ");
                        String prefixo = scanner.next();
                        System.out.println("Digite o ID da companhia que o avião pertence: ");
                        System.out.println("Precisa listar as companhias "+ "\n" + " [1]SIM "+ "\n" + " [2]NÃO ");
                        op2 = scanner.nextInt();
                        if(op2 == 1){
                            try {
                                Connection conexao = DAO.createConnection();;
                                String query = "select ID_COMPANHIA,NOME,CNPJ from COMPANHIA;";
                                PreparedStatement stmt = conexao.prepareStatement(query);
                                ResultSet rs = stmt.executeQuery(query);
                                System.out.println("ID -- NOME  --  CNPJ" + "\n" +
                                                   "--------------------");
                                while (rs.next()) {
                                String id = rs.getString(1);
                                String nome = rs.getString(2);
                                String cnpj = rs.getString(3);
                              
                                
                                System.out.print(id+ " | " + nome + " | ");
                                System.out.println(cnpj);
                                 
                        }
                        DAO.closeConnection();
                        rs.close();
                             
                            } catch (Exception e) {
                                System.out.println("Erro ao listar companhia. " + e.getMessage());
                            }
                        }
                        System.out.println("Digite o ID da companhia que o avião pertence: ");
                        int id_comp = scanner.nextInt();

                        new Aviao(marca,modelo,capa,prefixo,id_comp);
                    } catch (Exception e) {
                        System.out.println( e.getMessage());
                    }
                
                    break;
        
            default:
                break;
                case 4 :
                try {
                    Connection conexao = DAO.createConnection();;
                    String query = "select ID_AVIAO , MARCA , MODELO , PREFIXO , CAPACIDADE , ID_COMPANHIA from AVIAO;";
                    PreparedStatement stmt = conexao.prepareStatement(query);
			        ResultSet rs = stmt.executeQuery(query);
                    System.out.println("ID_AVIAO -- MARCA -- MODELO -- PREFIXO -- CAPACIDADE -- ID_COMPANHIA" + "\n" +
                                       "--------------------------------------------------------------------");
			        while (rs.next()) {
                    String id = rs.getString(1);
                    String marca = rs.getString(2);
				    String MODELO = rs.getString(3);
                    String PREFIXO = rs.getString(4);
                    String CAPA = rs.getString(5);
                    String ID_COMPANHIA = rs.getString(6);
				  
				    
				    System.out.print(id+ "     |    " + marca + "  |   " + MODELO + "   |   " + PREFIXO + "   |     " + CAPA + "      |   "+ ID_COMPANHIA + "      | \n");
				    
                    
			}
            DAO.closeConnection();
			rs.close();
                 
                } catch (Exception e) {
                    System.out.println("Erro ao listar avião. " + e.getMessage());
                }
                    break;
                    case 5 :
                    try {
                        Connection conexao = DAO.createConnection();;
                        String query = "select ID_AVIAO , MARCA , MODELO , PREFIXO , CAPACIDADE , ID_COMPANHIA from AVIAO;";
                        PreparedStatement stmt = conexao.prepareStatement(query);
                        ResultSet rs = stmt.executeQuery(query);
                        System.out.println("ID_AVIAO -- MARCA -- MODELO -- PREFIXO -- CAPACIDADE -- ID_COMPANHIA" + "\n" +
                                           "--------------------------------------------------------------------");
                        while (rs.next()) {
                        String id = rs.getString(1);
                        String marca = rs.getString(2);
                        String MODELO = rs.getString(3);
                        String PREFIXO = rs.getString(4);
                        String CAPA = rs.getString(5);
                        String ID_COMPANHIA = rs.getString(6);
                      
                        
                        System.out.print(id+ "     |    " + marca + "  |   " + MODELO + "   |   " + PREFIXO + "   |     " + CAPA + "      |   "+ ID_COMPANHIA + "      | \n");
                               
                }
                System.out.println("Digite o ID do avião que deseja excluir");
                int op_exl = scanner.nextInt();

                PreparedStatement stmt2 = conexao.prepareStatement(
                    "DELETE FROM aviao WHERE ID_AVIAO = ?;"
                 );
                 stmt2.setInt(1, op_exl);
                 stmt2.execute();
                DAO.closeConnection();
                rs.close();
                     
                    } catch (Exception e) {
                        System.out.println("Erro ao listar avião. " + e.getMessage());
                    }
                        break;
            }
            }
            if(op_aero == 2) {
                System.out.println("Escolha uma opção");
                System.out.println("[10] Cadastrar helicotero");
                System.out.println("[11] listar helicotero");
                System.out.println("[12] excluir helicotero");
                op = scanner.nextInt();
            switch (op) {
            case 10:
        
                try {
                    System.out.println("Digite a marca do helicotero: ");
                    String marca = scanner.next();
                    System.out.println("Digite o modelo do helicotero: ");
                    String modelo = scanner.next();
                    System.out.println("Digite a capacidade helicotero: ");
                    int capa = scanner.nextInt();
                    System.out.println("Digite o cor do helicotero: ");
                    String cor = scanner.next();
            
            
                    new Helicotero(marca,modelo,capa,cor);
                } catch (Exception e) {
                    System.out.println( e.getMessage());
                }
            
                break;
            
           
            case 11 :
            try {
                Connection conexao = DAO.createConnection();;
                String query = "select ID_HELICOPTERO, MARCA,  MODELO, COR,CAPACIDADE from helicoptero;";
                PreparedStatement stmt = conexao.prepareStatement(query);
                ResultSet rs = stmt.executeQuery(query);
                System.out.println("ID_HELICOPTERO -- MARCA -- MODELO -- COR -- CAPACIDADE " + "\n" +
                                   "---------------------------------------------------------");
                while (rs.next()) {
                String id = rs.getString(1);
                String marca = rs.getString(2);
                String MODELO = rs.getString(3);
                String COR = rs.getString(4);
                String CAPA = rs.getString(5);
                
                System.out.print(id+ "     |    " + marca + "  |   " + MODELO + "   |   " + COR + "   |     " + CAPA + "      |   "+  " \n");
                
                
            }
            DAO.closeConnection();
            rs.close();
             
            } catch (Exception e) {
                System.out.println("Erro ao listar helicotero. " + e.getMessage());
            }
            break;
            case 12 :
            try {
                Connection conexao = DAO.createConnection();;
                String query = "select ID_HELICOPTERO, MARCA,  MODELO, COR,CAPACIDADE from helicoptero;";
                PreparedStatement stmt = conexao.prepareStatement(query);
                ResultSet rs = stmt.executeQuery(query);
                System.out.println("ID_HELICOPTERO -- MARCA -- MODELO -- COR -- CAPACIDADE " + "\n" +
                                   "---------------------------------------------------------");
                while (rs.next()) {
                String id = rs.getString(1);
                String marca = rs.getString(2);
                String MODELO = rs.getString(3);
                String COR = rs.getString(4);
                String CAPA = rs.getString(5);
                
                System.out.print(id+ "     |    " + marca + "  |   " + MODELO + "   |   " + COR + "   |     " + CAPA + "      |   "+  " \n");
                
               
                }
                System.out.println("Digite o ID do helicotero que deseja excluir");
                int op_exl = scanner.nextInt();

                PreparedStatement stmt2 = conexao.prepareStatement(
                    "DELETE FROM helicoptero WHERE ID_HELICOPTERO = ?;"
                 );
                 stmt2.setInt(1, op_exl);
                 stmt2.execute();
            
            DAO.closeConnection();
            rs.close();

             
            } catch (Exception e) {
                System.out.println("Erro ao listar helicotero. " + e.getMessage());
            }
        
              
        

        default:
         break;
        }
    }
            if(op_aero == 3) {
                System.out.println("Escolha uma opção");
                System.out.println("[13] Cadastrar jato");
                System.out.println("[14] listar jato");
                System.out.println("[15] excluir jato");
                op = scanner.nextInt();
            switch (op) {
            case 13:
            
                try {
                    System.out.println("Digite a marca do jato: ");
                    String marca = scanner.next();
                    System.out.println("Digite o modelo do jato: ");
                    String modelo = scanner.next();
                    System.out.println("Digite a velocidade jato: ");
                    int velocidade = scanner.nextInt();
                    System.out.println("Digite o cor do jato: ");
                    String cor = scanner.next();
            
            
                    new Jato(marca,modelo,velocidade,cor);
                } catch (Exception e) {
                    System.out.println( e.getMessage());
                }
            
                break;
            default:
            break;
            case 14 :
            try {
                Connection conexao = DAO.createConnection();;
                String query = "select  ID_JATO,MARCA,MODELO,COR,VELOCIDADE from jato;";
                PreparedStatement stmt = conexao.prepareStatement(query);
                ResultSet rs = stmt.executeQuery(query);
                System.out.println("ID_JATO -- MARCA -- MODELO -- COR -- VELOCIDADE " + "\n" +
                                   "---------------------------------------------------------");
                while (rs.next()) {
                String id = rs.getString(1);
                String marca = rs.getString(2);
                String MODELO = rs.getString(3);
                String COR = rs.getString(4);
                String VELO = rs.getString(5);
                
                System.out.print(id+ "     |    " + marca + "  |   " + MODELO + "   |   " + COR + "   |     " + VELO + "      |   "+  "    | \n");
                
                
            }
            DAO.closeConnection();
            rs.close();
             
            } catch (Exception e) {
                System.out.println("Erro ao listar JATO. " + e.getMessage());
            }
                break;
                case 15 :
            try {
                Connection conexao = DAO.createConnection();;
                String query = "select  ID_JATO,MARCA,MODELO,COR,VELOCIDADE from jato;";
                PreparedStatement stmt = conexao.prepareStatement(query);
                ResultSet rs = stmt.executeQuery(query);
                System.out.println("ID_JATO -- MARCA -- MODELO -- COR -- VELOCIDADE " + "\n" +
                                   "---------------------------------------------------------");
                while (rs.next()) {
                String id = rs.getString(1);
                String marca = rs.getString(2);
                String MODELO = rs.getString(3);
                String COR = rs.getString(4);
                String VELO = rs.getString(5);
                
                System.out.print(id+ "     |    " + marca + "  |   " + MODELO + "   |   " + COR + "   |     " + VELO + "      |   "+  "    | \n");
                
                
            }
            System.out.println("Digite o ID do jato que deseja excluir");
                int op_exl = scanner.nextInt();

                PreparedStatement stmt2 = conexao.prepareStatement(
                    "DELETE FROM jato WHERE ID_jato = ?;"
                 );
                 stmt2.setInt(1, op_exl);
                 stmt2.execute();
            DAO.closeConnection();
            rs.close();
             
            } catch (Exception e) {
                System.out.println("Erro ao listar JATO. " + e.getMessage());
            }
                break;
            }
            }

                case 5:
                    try {
                        System.out.println("Digite a local do hangar: ");
                        String local = scanner.next();
                        System.out.println("Digite o id do aviao que sera alocado no hangar: ");
                        System.out.println("Precisa listar os avioes "+ "\n" + " [1]SIM "+ "\n" + " [2]NÃO ");
                        op2 = scanner.nextInt();
                        if(op2 == 1){
                            try {
                                Connection conexao = DAO.createConnection();;
                                String query = "select ID_AVIAO , MARCA , MODELO , PREFIXO , CAPACIDADE , ID_COMPANHIA from AVIAO;";
                                PreparedStatement stmt = conexao.prepareStatement(query);
                                ResultSet rs = stmt.executeQuery(query);
                                System.out.println("ID_AVIAO -- MARCA -- MODELO -- PREFIXO -- CAPACIDADE -- ID_COMPANHIA" + "\n" +
                                                   "--------------------------------------------------------------------");
                                while (rs.next()) {
                                String id = rs.getString(1);
                                String marca = rs.getString(2);
                                String MODELO = rs.getString(3);
                                String PREFIXO = rs.getString(4);
                                String CAPA = rs.getString(5);
                                String ID_COMPANHIA = rs.getString(6);
                              
                                
                                System.out.print(id+ "     |    " + marca + "  |   " + MODELO + "   |   " + PREFIXO + "   |     " + CAPA + "      |   "+ ID_COMPANHIA + "      | \n");
                                
                                 
                        }
                        DAO.closeConnection();
                        rs.close();
                             
                            } catch (Exception e) {
                                System.out.println("Erro ao listar aviao. " + e.getMessage());
                            }
                        }
                        System.out.println("Digite o id do aviao que sera alocado no hangar: ");
                        int id_aviao = scanner.nextInt();

                        new Hangar(local,id_aviao);
                    } catch (Exception e) {
                        System.out.println( e.getMessage());
                    }
                
                        break;
        
                case 6 :
                try {
                    Connection conexao = DAO.createConnection();;
                    String query = "select ID_HANGAR,LOCAL,ID_AVIAO from HANGAR;";
                    PreparedStatement stmt = conexao.prepareStatement(query);
			        ResultSet rs = stmt.executeQuery(query);
                    System.out.println("ID_HANGAR  --   LOCAL   --  ID_AVIAO " + "\n" +
                                       "---------------------------------");
			        while (rs.next()) {
                    String id = rs.getString(1);
                    String LOCAL = rs.getString(2);
				    String ID_AVIAO = rs.getString(3);
            
				    System.out.print(id+ "     |    " + LOCAL + "  |   " + ID_AVIAO + " \n");
				    
				     
			}
            DAO.closeConnection();
			rs.close();
                 
                } catch (Exception e) {
                    System.out.println("Erro ao listar companhia. " + e.getMessage());
                }
                    break;

                    case 20:
                    try {
                        System.out.println("Digite a numero da pista: ");
                        String numero = scanner.next();
                        
            
                        new Pista(numero);
                    } catch (Exception e) {
                        System.out.println( e.getMessage());
                    }
                
                        break;
        
                case 22 :
                try {
                    Connection conexao = DAO.createConnection();;
                    String query = "select ID_PISTA,NUMERO from PISTA;";
                    PreparedStatement stmt = conexao.prepareStatement(query);
			        ResultSet rs = stmt.executeQuery(query);
                    System.out.println("ID_PISTA  --   NUMERO " + "\n" +
                                       "------------------------");
			        while (rs.next()) {
                    String id = rs.getString(1);
                    String NUMERO = rs.getString(2);
				 
				    System.out.print(id+ "         |        " + NUMERO + " \n");
				    
				     
			}
            DAO.closeConnection();
			rs.close();
                 
                } catch (Exception e) {
                    System.out.println("Erro ao listar companhia. " + e.getMessage());
                }
                    break;
            default:
            System.out.println("Opção invalida");
            break;
        }
        } while(op != 9);
            
          



        }
                
       
}
