public class Fourh {
    public static boolean judgeCircle(String moves) {
        boolean CheckPosition=true;
        int X = 0,Y=0;
        char[] arrayMoves = new char[moves.length()];
        for (int i = 0; i < moves.length(); i++) {
            arrayMoves[i] = moves.charAt(i);
        }
        for (int i=0;i<arrayMoves.length;i++)
        {
            switch (arrayMoves[i]){
                case 'L':{
                    X--;
                    break;
                }
                case 'R':{
                    X++;
                    break;
                }
                case 'U': {
                    Y++;
                    break;
                }
                case 'D':{
                    Y--;
                    break;
                }
            }
        }
        if(X==0&&Y==0) {
            CheckPosition=true;
        }else {
            CheckPosition=false;
        }
        return CheckPosition;
    }
    public static void main(String[] args) {
        String Moves="LR";
        System.out.println(judgeCircle(Moves));
    }
}
