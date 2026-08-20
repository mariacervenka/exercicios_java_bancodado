package view;

//import statico vc ta importando o metodo
//se o import eh sem static vc importa a classe
import static javax.swing.JOptionPane.*;

public class MenuPrincipal {

    //combobox
    public void menu(){

        String[] item = {"Vendedor", "Venda", "Finalizar"};
        String opcao;

        do{ //vai usar o showImputDialog que retorna um objeto pq tem que converter e tem q por (String) na frente
            //parentComponent = null, mensagem q o user vai ler, titulo da janela, valor inteiro q representa o tipo da msg,
            //como a gente ja importou o JO eh so usar esse information_message, icone da empresa mas nao vai usar ent poe null,
            //vetor que vc criou antes (especificamente tem q ser um vetor), passar o primeiro valor

            opcao = (String)showInputDialog(null,
                    "selecione uma opçao",
                    "*** MENU PRINCIPAL ***",
                    INFORMATION_MESSAGE,
                    null,
                    item,
                    item[0]);


            switch (opcao.toLowerCase()){

                case "vendedor" -> new MenuVendedor().menu();
                case "venda" -> new MenuVenda().menu();

            }

        }
        while(!opcao.toLowerCase().equals("finalizar")); //enquanto opcao nao for igual a finalizar continua o loop

    }

}
