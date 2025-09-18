package SoftwarePizzaria;

import Usuarios.Usuarios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class PizzariaDeMuspelheim {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Usuarios> listaUsuarios = new ArrayList<>();
        int count = 0;
        String continuar = "";
        
        do {
            System.out.println("----Cadastrar Usuários----");
            System.out.print("Nome: ");
            String nome = entrada.next();
            System.out.print("Email: ");
            String email = entrada.next();
            System.out.print("Senha: ");
            String senha = entrada.next();
            System.out.print("Tipo de usuário: ");
            String tipoDeUsuario = entrada.next();
            
            Usuarios usuarios = new Usuarios();
            
            usuarios.setNome(nome);
            usuarios.setEmail(email);
            usuarios.setSenha(senha);
            usuarios.setTipoDeUsuario(tipoDeUsuario);
            
            listaUsuarios.add(usuarios);
            
            System.out.println("Continuar");
            continuar = entrada.next();
            
            if (continuar.equalsIgnoreCase("*Click*")) {
                break;
            }
            
            System.out.println("Usuário cadastrado com sucesso.");
            
        }while(!continuar.equalsIgnoreCase("*Click*")) ;
        
        for (int i = 0; listaUsuarios.size() > i; i++)  {
            Usuarios usuarios = listaUsuarios.get(i);
            
            System.out.println("\n----Dados do Usuário----");
            System.out.println("Nome: " + usuarios.getNome());
            System.out.println("Email: " + usuarios.getEmail());
            System.out.println("Senha: " + usuarios.getSenha());
            System.out.println("Tipo de usuário: " + usuarios.getTipoDeUsuario());
    }
    }
    
}
