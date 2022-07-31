package chessgame;
import java.util. LinkedList;
public class piece {
int xp;
int yp;
int x;
int y;
boolean isWhite;
LinkedList<piece> ps;
String name;

public piece(int xp ,int yp ,boolean isWhite ,String n, LinkedList<piece>ps) {
	this.xp = xp;
	this.yp =yp;
	x=xp*64;
	y=yp*64;
	this.isWhite = isWhite;
	this.ps = ps;
	name = n;
	ps.add(this);
	}

	 public void move(int xp,int yp){
	        if(ChessGame.getpiece(xp*64, yp*64)!=null){
	            if(ChessGame.getpiece(xp*64, yp*64).isWhite!=isWhite){
	        ChessGame.getpiece(xp*64, yp*64).kill();
	                
	            }else{
	                  x=this.xp*64;
	        y=this.yp*64;
	            return;
	        }
	        }
	        this.xp=xp;
	        this.yp=yp;
	           x=xp*64;
	        y=yp*64;
	    }
	    public void kill(){
	        ps.remove(this);
	    }
	}

