package main;

import Relatorios.Relatorio;
import classeAncestral.ItemDeBiblioteca;
import enums.StatusDoItem;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import livros.Livro;
import trabalhosDeConclusao.Dissertacao;
import trabalhosDeConclusao.Monografia;
import trabalhosDeConclusao.Tese;

/**
 *
 * @author Alisson Jaques
 */
public class ConsultaItensAcervo {
    
    public static void consultaTodosOsItens(ArrayList<ItemDeBiblioteca> acervo) throws ParseException{
                
        for (ItemDeBiblioteca acervo1 : acervo) {
            if(acervo1 instanceof Livro){
                System.out.println(acervo1);
                System.out.println(((Livro) acervo1).fichaCatalografica());
            }
            else if(acervo1 instanceof Relatorio){
                System.out.println(acervo1);
                System.out.println(((Relatorio) acervo1).fichaCatalografica());
            }
            else if(acervo1 instanceof Dissertacao){
                System.out.println(acervo1);
                System.out.println(((Dissertacao) acervo1).fichaCatalografica());
            }
            else if(acervo1 instanceof Monografia){
                System.out.println(acervo1);
                System.out.println(((Monografia) acervo1).fichaCatalografica());
            }
            else if(acervo1 instanceof Tese){
                System.out.println(acervo1);
                System.out.println(((Tese) acervo1).fichaCatalografica());
            }
            else{
                System.out.println(acervo1);
            }
        }
    }
    
    public static void consultaPorTitulo(String termo,ArrayList<ItemDeBiblioteca> acervo) throws ParseException{
        String frase;
        boolean botao = false;
        for (ItemDeBiblioteca acervo1 : acervo) {
            frase = acervo1.getTitulo();
            
            if(frase.contains(termo)){
                botao = true;
                if(acervo1 instanceof Livro){
                    System.out.println(acervo1);
                    System.out.println(((Livro) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Relatorio){
                    System.out.println(acervo1);
                    System.out.println(((Relatorio) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Dissertacao){
                    System.out.println(acervo1);
                    System.out.println(((Dissertacao) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Monografia){
                    System.out.println(acervo1);
                    System.out.println(((Monografia) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Tese){
                    System.out.println(acervo1);
                    System.out.println(((Tese) acervo1).fichaCatalografica());
                }
                else{
                    System.out.println(acervo1);
                }            
            }                     
        }
        
        if(!botao){
                System.out.println("N??o foram encontrados intens que satisfa??am a busca informada.");
        }
    }
    
    public static void consultaPorAno(Short termo,ArrayList<ItemDeBiblioteca> acervo) throws ParseException{
        short ano;
        boolean botao = false;
        for (ItemDeBiblioteca acervo1 : acervo) {
            ano = acervo1.getAno();
            
            if(ano==termo){
                botao = true;
                if(acervo1 instanceof Livro){
                    System.out.println(acervo1);
                    System.out.println(((Livro) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Relatorio){
                    System.out.println(acervo1);
                    System.out.println(((Relatorio) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Dissertacao){
                    System.out.println(acervo1);
                    System.out.println(((Dissertacao) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Monografia){
                    System.out.println(acervo1);
                    System.out.println(((Monografia) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Tese){
                    System.out.println(acervo1);
                    System.out.println(((Tese) acervo1).fichaCatalografica());
                }
                else{
                    System.out.println(acervo1);
                }            
            }                 
        }
        
        if(!botao){
                System.out.println("N??o foram encontrados intens que satisfa??am a busca informada.");
        }
    }
    
    public static void consultaPorCodigo(String termo,ArrayList<ItemDeBiblioteca> acervo) throws ParseException{
        String frase;
        boolean botao = false;
        for (ItemDeBiblioteca acervo1 : acervo) {
            frase = acervo1.getCodigoId();
            
            if(frase.contains(termo)){
                botao = true;
                if(acervo1 instanceof Livro){
                    System.out.println(acervo1);
                    System.out.println(((Livro) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Relatorio){
                    System.out.println(acervo1);
                    System.out.println(((Relatorio) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Dissertacao){
                    System.out.println(acervo1);
                    System.out.println(((Dissertacao) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Monografia){
                    System.out.println(acervo1);
                    System.out.println(((Monografia) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Tese){
                    System.out.println(acervo1);
                    System.out.println(((Tese) acervo1).fichaCatalografica());
                }
                else{
                    System.out.println(acervo1);
                }            
            }                 
        }
        
        if(!botao){
                System.out.println("N??o foram encontrados itens que satisfa??am a busca informada.");
        }
    }
    
    public static void consultaParaEmprestimo(String termo,ArrayList<ItemDeBiblioteca> acervo) throws ParseException{
        String frase;
        boolean botao = false;
        byte escolha;
        Scanner scan = new Scanner(System.in);
        for (ItemDeBiblioteca acervo1 : acervo) {
            frase = acervo1.getCodigoId();
           
            if(frase.equals(termo)){
                botao = true;
                System.out.println("Item encontrado:");
                if(acervo1 instanceof Livro){
                    System.out.println(acervo1);
                    System.out.println(((Livro) acervo1).fichaCatalografica());
                    System.out.print("Deseja realizar o empr??stimo do item? (1 - sim | 2 - n??o): ");
                    escolha = scan.nextByte();
                    while(escolha!=1 && escolha!=2){
                        System.out.print("Op????o inv??lida, por favor escolha 1 (fazer empr??stimo) ou 2 (n??o fazer empr??stimo): ");
                        escolha = scan.nextByte();
                    }
                    if(escolha==1){
                        if(acervo1.getStatus()==StatusDoItem.DISPON??VEL){
                            acervo1.setStatus(StatusDoItem.EMPRESTADO);
                            System.out.println("Empr??stimo realizado com sucesso!");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                        else{
                            System.out.println("N??o foi poss??vel realizar o empr??stimo. Item j?? emprestado.");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                    }
                    else{
                        System.out.println("Empr??stimo cancelado pelo usu??rio.");
                        System.out.println("------------------------------------------------------------------------------------\n");
                    }
                }
                else if(acervo1 instanceof Relatorio){
                    System.out.println(acervo1);
                    System.out.println(((Relatorio) acervo1).fichaCatalografica());
                    System.out.print("\nDeseja realizar o empr??stimo do item? (1 - sim | 2 - n??o): ");
                    escolha = scan.nextByte();
                    while(escolha!=1 || escolha!=2){
                        System.out.print("Op????o inv??lida, por favor escolha 1 (fazer empr??stimo) ou 2 (n??o fazer empr??stimo): ");
                        escolha = scan.nextByte();
                    }
                    if(escolha==1){
                        if(acervo1.getStatus()==StatusDoItem.DISPON??VEL){
                            acervo1.setStatus(StatusDoItem.EMPRESTADO);
                            System.out.println("Empr??stimo realizado com sucesso!");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                        else{
                            System.out.println("N??o foi poss??vel realizar o empr??stimo. Item j?? emprestado.");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                    }
                    else{
                        System.out.println("Empr??stimo cancelado pelo usu??rio.");
                        System.out.println("------------------------------------------------------------------------------------\n");
                    }
                }
                else if(acervo1 instanceof Dissertacao){
                    System.out.println(acervo1);
                    System.out.println(((Dissertacao) acervo1).fichaCatalografica());
                    System.out.print("\nDeseja realizar o empr??stimo do item? (1 - sim | 2 - n??o): ");
                    escolha = scan.nextByte();
                    while(escolha!=1 && escolha!=2){
                        System.out.print("Op????o inv??lida, por favor escolha 1 (fazer empr??stimo) ou 2 (n??o fazer empr??stimo): ");
                        escolha = scan.nextByte();
                    }
                    if(escolha==1){
                        if(acervo1.getStatus()==StatusDoItem.DISPON??VEL){
                            acervo1.setStatus(StatusDoItem.EMPRESTADO);
                            System.out.println("Empr??stimo realizado com sucesso!");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                        else{
                            System.out.println("N??o foi poss??vel realizar o empr??stimo. Item j?? emprestado.");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                    }
                    else{
                        System.out.println("Empr??stimo cancelado pelo usu??rio.");
                        System.out.println("------------------------------------------------------------------------------------\n");
                    }
                }
                else if(acervo1 instanceof Monografia){
                    System.out.println(acervo1);
                    System.out.println(((Monografia) acervo1).fichaCatalografica());
                    System.out.print("\nDeseja realizar o empr??stimo do item? (1 - sim | 2 - n??o): ");
                    escolha = scan.nextByte();
                    while(escolha!=1 && escolha!=2){
                        System.out.print("Op????o inv??lida, por favor escolha 1 (fazer empr??stimo) ou 2 (n??o fazer empr??stimo): ");
                        escolha = scan.nextByte();
                    }
                    if(escolha==1){
                        if(acervo1.getStatus()==StatusDoItem.DISPON??VEL){
                            acervo1.setStatus(StatusDoItem.EMPRESTADO);
                            System.out.println("Empr??stimo realizado com sucesso!");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                        else{
                            System.out.println("N??o foi poss??vel realizar o empr??stimo. Item j?? emprestado.");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                    }
                    else{
                        System.out.println("Empr??stimo cancelado pelo usu??rio.");
                        System.out.println("------------------------------------------------------------------------------------\n");
                    }
                }
                else if(acervo1 instanceof Tese){
                    System.out.println(acervo1);
                    System.out.println(((Tese) acervo1).fichaCatalografica());
                    System.out.print("\nDeseja realizar o empr??stimo do item? (1 - sim | 2 - n??o): ");
                    escolha = scan.nextByte();
                    while(escolha!=1 || escolha!=2){
                        System.out.print("Op????o inv??lida, por favor escolha 1 (fazer empr??stimo) ou 2 (n??o fazer empr??stimo): ");
                        escolha = scan.nextByte();
                    }
                    if(escolha==1){
                        if(acervo1.getStatus()==StatusDoItem.DISPON??VEL){
                            acervo1.setStatus(StatusDoItem.EMPRESTADO);
                            System.out.println("Empr??stimo realizado com sucesso!");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                        else{
                            System.out.println("N??o foi poss??vel realizar o empr??stimo. Item j?? emprestado.");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                    }
                    else{
                        System.out.println("Empr??stimo cancelado pelo usu??rio.");
                        System.out.println("------------------------------------------------------------------------------------\n");
                    }
                }
                else{
                    System.out.println(acervo1);
                    System.out.print("\nDeseja realizar o empr??stimo do item? (1 - sim | 2 - n??o): ");
                    escolha = scan.nextByte();
                    while(escolha!=1 && escolha!=2){
                        System.out.print("Op????o inv??lida, por favor escolha 1 (fazer empr??stimo) ou 2 (n??o fazer empr??stimo): ");
                        escolha = scan.nextByte();
                    }
                    if(escolha==1){
                        if(acervo1.getStatus()==StatusDoItem.DISPON??VEL){
                            acervo1.setStatus(StatusDoItem.EMPRESTADO);
                            System.out.println("Empr??stimo realizado com sucesso!");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                        else{
                            System.out.println("N??o foi poss??vel realizar o empr??stimo. Item j?? emprestado.");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                    }
                    else{
                        System.out.println("Empr??stimo cancelado pelo usu??rio.");
                        System.out.println("------------------------------------------------------------------------------------\n");
                    }
                }            
            }                 
        }
        
        if(!botao){
                System.out.println("N??o foram encontrados itens que satisfa??am a busca informada.");
                System.out.println("------------------------------------------------------------------------------------\n");
        }
    }
}
