import java.util.ArrayList;
import java.util.Scanner;


    public class exec04 {
        static class Usuario {
            String nome;
            String email;
            String senha;
            public Usuario(String nome, String email, String senha) {
                this.nome = nome;
                this.email = email;
                this.senha = senha;
            }

            @Override
            public String toString() {
                return "Nome: " + nome + ", Email: " + email + ", Senha: " + senha;
            }
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                ArrayList<Usuario> usuarios = new ArrayList<>();

               System.out.println("Cadastro de usuario");
               while (true) { 
                System.out.println("Digite o nome do usuario:(ou sair para finalizar): ");
                String nome = scanner.nextLine();
                if (nome.equalsIgnoreCase("sair")){
                    break;
                }
                System.out.println("Digite o email do usuario: ");
                String email = scanner.nextLine();
                
                System.out.println("Digite a senha do usuario: ");
                String senha = scanner.nextLine();

                usuarios.add(new Usuario(nome, email, senha));
               }
               System.out.println("Usuarios cadastrados: ");
               for (Usuario usuario : usuarios) {
                   System.out.println(usuario);
                    scanner.close();
                }
            }
        }


}
