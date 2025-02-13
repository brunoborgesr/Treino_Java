package exerciciosS1.operadores_logicos;

public class acesso {
    public static void main(String[] args){
        String usuario = "admin";
        Integer senha = 1234;
        boolean acessoPermitido = (usuario.equals("admin") && senha.equals(1234));
        if(acessoPermitido == true){
            System.out.println("Acesso Permitido");
        }
        else{
            System.out.println("Acesso Negado");
        }
    }
}
