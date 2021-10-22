public class InputValidator {

    public boolean parenthesisValidator(String s){

        /*
        Verilen stringi bir char arraye donusturuyor. Sonrasında bu charArr icerisinde sirayla gezip parantezleri
        string arraye atiyor. Kapali parantez bulursa ve charArr'nin ilk elemani ise false return ediyor. String
        arrayin son atanan elemani o kapali parantezin esimi diye bakiyor. Eger esi ise returnValue degiskenine
        true atiyor ve parantezi string arrayden silmis gibi davraniyor. Eger esi degil ise returnValue degiskenine
        false degerini atiyor. CharArr'nin tum elemanlari kontrol edildikten sonra returnValue degerini return ediyor.
         */

        char[] charArr = s.toCharArray();
        String[] arr = new String[s.length()];
        boolean returnValue = false;

        int j = 0;
        for (int i=0;i<charArr.length;i++){
            if("(".equals(String.valueOf(charArr[i]))
                    || "{".equals(String.valueOf(charArr[i]))
                    || "[".equals(String.valueOf(charArr[i]))){
                arr[j] = String.valueOf(charArr[i]);
                j++;
            }else if(")".equals(String.valueOf(charArr[i]))
                    || "}".equals(String.valueOf(charArr[i]))
                    || "]".equals(String.valueOf(charArr[i]))){
                if (j==0){
                    return false;
                }else if (")".equals(String.valueOf(charArr[i])) && "(".equals(arr[j-1])){
                    if (j==1){
                        returnValue = true;
                    }else {
                        j--;
                    }
                }else if ("}".equals(String.valueOf(charArr[i])) && "{".equals(arr[j-1])){
                    if (j==1){
                        returnValue = true;
                    }else {
                        j--;
                    }
                }else if ("]".equals(String.valueOf(charArr[i])) && "[".equals(arr[j-1])){
                    if (j==1){
                        returnValue = true;
                    }else {
                        j--;
                    }
                }
            }
        }

        return returnValue;
    }

}
