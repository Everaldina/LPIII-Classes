package com.data;

public class EMail {
    private String email;

    public EMail(){
        this(null);
    }
    public EMail(String EMail){
        email = EMail;
    }

    protected boolean emailValido(){
        int i;
        char ch;
        int locAt = email.indexOf('@');
        int locDot = email.lastIndexOf('.');

        if(email.indexOf(' ')==-1) {//verifica se nao ha espacos
            if (locAt != -1 && locDot != -1) { // verifica se ha @ e . no email
                if (locAt == email.lastIndexOf('@')) { // verificar se so ha um @

                    //@ esta antes de .com
                    //entre 1 e 64 digitos antes do @
                    if (locAt < locDot && locAt <= 64 && locAt > 0) {
                        if(locDot < email.length()-1){ //se ha um .com .br .or etc
                            if(locDot-locAt>1 && locDot-locAt<=254){// dominio nao nulo e com limite 253 caracteres
                                for (i=locAt+1;i<locDot;i++){
                                    ch = email.charAt(i);

                                    //verifica se dominio tem digitos validos
                                    if(ch!='.' && ch!='-' && !Character.isDigit(ch) && !Character.isLetter(ch) ){
                                        return false;
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;

    }

    public String getDominioLong(){
        int ini;
        if(this.emailValido()){
            ini = email.indexOf('@');
            return email.substring(ini+1);
        }else{
            return null;
        }
    }
    public String getDominio(){
        int ini, fim;
        if(this.emailValido()){
            ini = email.indexOf('@');
            fim = email.lastIndexOf('.');
            return email.substring(ini+1, fim);
        }else{
            return null;
        }
    }


    public String getEMail(){
        return email;
    }
    public void setEMail(String email){
        this.email = email;
    }

}
