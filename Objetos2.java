    import java.util.Scanner; 
public class Objetos2
    {public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numEPS;
        Objeto1[] lasEps = new Objeto1[50]; 
        int numEPS, canta, cantf, cants;
        String nom;
        double vala, valf, vals;
        double promedioval=0;
        int promediocant=0;
        System.out.println("Digite la cantidad de EPS's: ");
        numEPS = sc.nextInt();
        for(int i = 0; i < numEPS; i++){
        System.out.println("Digite el nombre de la EPS: ");
        nom = sc.next();
        System.out.println("Digite la cantidad de facturas notificadas por autorizacion: ");
        canta = sc.nextInt();
        System.out.println("Digite el valor de las facturas notificadas por autorizacion: ");
        vala = sc.nextDouble();
        System.out.println("Digite la cantidad de facturas notificadas por facturacion: ");
        cantf = sc.nextInt();
        System.out.println("Digite el valor de las facturas notificadas por facturacion: ");
        valf = sc.nextDouble();
        System.out.println("Digite la cantidad de facturas notificadas por soportes: ");
        cants = sc.nextInt();
        System.out.println("Digite el valor de las facturas notificadas por soportes: ");
        vals = sc.nextDouble();
            Objeto1 eps = new Objeto1(); 
            eps.nom = nombre;
            eps.canta = cantAut;
            eps.vala = valAut;
            eps.cantf = cantFac;
            eps.valf = valFac;
            eps.cants = cantSop;
            eps.vals = valSop;
            lasEps[i] = unEstudiante;
        }
    for(int i=0; i<numEPS;i++){
        promediocant=promediocant+(cantAut[i]+cantFac[i]+cantSop[i]/3)/numEPS;
    }
    System.out.println("La cantidad promedio Notificada es: "+promediocant);
        for(int i=0; i<numEPS;i++){
        promedioval=promedioval+(valAut[i]+valFac[i]+valSop[i]/3)/numEPS;
    }
    System.out.println("El valor promedio Notificado es: "+promedioval);
    }    
}

