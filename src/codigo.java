public class codigo {
    
public int calcular(int num1,int potencia){
    if(potencia==1){
        return num1;
    }
    if(potencia==0){
        return 1;
    }
    return num1*calcular(num1,potencia-1);
    
}

    
    
    
}
