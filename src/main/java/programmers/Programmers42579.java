package programmers;

import java.util.HashMap;

/*
베스트앨범
 */
public class Programmers42579 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String,Integer> genre = new HashMap<>();
        HashMap<Integer,String> play = new HashMap<>();
        for (int i = 0; i < genres.length; i++){
            if(genre.containsKey(genres[i])){
                genre.replace(genres[i],genre.get(genres[i])+plays[i]);
            } else {
                genre.put(genres[i],plays[i]);
            }
            play.put(plays[i],genres[i]);
        }

        for (int i = 0; i < genre.size(); i++){
            for (int j = 0; j < play.size(); j++){
                int temp = 0;

            }
        }

        return answer;
    }

    public static void main(String args[]){
        Programmers42579 p = new Programmers42579();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        for(int i : p.solution(genres,plays)){
            System.out.println(i);
        }
    }
}
