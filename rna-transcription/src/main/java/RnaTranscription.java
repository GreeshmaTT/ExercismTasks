class RnaTranscription
{

    String transcribe(String dnaStrand)
    {
        String rnaStrand ="";
        int lengthDna = dnaStrand.length();
        for(int i=0;i<lengthDna;i++){
            char c = dnaStrand.charAt(i);
            switch(c){
                case 'G':rnaStrand += 'C';break;
                case 'A':rnaStrand += 'U';break;
                case 'T':rnaStrand += 'A';break;
                case 'C':rnaStrand += 'G';break;
            }
        }
        return rnaStrand;
    }

}
