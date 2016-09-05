/*Kidnapper kidnaps you and writes a ransom note. He does not write it with hand, as handwriting can put him in, so reaches to a magazine at table and creates ransom note. We need to find out given ransom string and magazine string, is it possible to create given ransom note. Kidnapper can use individual characters of words.
Analysis
We need to check if magazine string contains all characters and in equal or greater number, present in ransom note.
How can we keep track which characters are present and how many instances of characters are present in magazine string? Simple standard technique. Create a hash table with 256 values, where key is character, and value as the number of instances it occurs.
Now go through each character in ransom note, and decrement corresponding value in hash table. If we try to decrease a value already zero,  we return false. If we reach at the end of ransom note, we return true.*/
package String;

public class RandomStringFromMAgazine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//sol 1
/*int ransom_note(char * magazine, char *ransom){

        char *mag = magazine;
        char *rnote = ransom;
        int hash[256];
        /* Reading all characters from magazine */
      /*  while(*mag != '\0'){
                hash[(*mag)]++;
                mag++;
        }*/
        /* Now checking each ransom string character */  
       /* while(*rnote != '\0'){
                if(hash[(*rnote)] == 0) return false;
                hash[(*rnote)]--;
                rnote++;
        }
        return true;
}*/


//sol 2
/*
AddThis Sharing Buttons1
Ransom note from magazine
Kidnapper kidnaps you and writes a ransom note. He does not write it with hand, as handwriting can put him in, so reaches to a magazine at table and creates ransom note. We need to find out given ransom string and magazine string, is it possible to create given ransom note. Kidnapper can use individual characters of words.
Analysis
We need to check if magazine string contains all characters and in equal or greater number, present in ransom note.
How can we keep track which characters are present and how many instances of characters are present in magazine string? Simple standard technique. Create a hash table with 256 values, where key is character, and value as the number of instances it occurs.
Now go through each character in ransom note, and decrement corresponding value in hash table. If we try to decrease a value already zero,  we return false. If we reach at the end of ransom note, we return true.
Code ransom note problem

int ransom_note(char * magazine, char *ransom){

        char *mag = magazine;
        char *rnote = ransom;
        int hash[256];
        /* Reading all characters from magazine */
       /* while(*mag != '\0'){
                hash[(*mag)]++;
                mag++;
        }*/
        /* Now checking each ransom string character */  
       /* while(*rnote != '\0'){
                if(hash[(*rnote)] == 0) return false;
                hash[(*rnote)]--;
                rnote++;
        }
        return true;
}
view rawransome_note.c hosted with ❤ by GitHub
Complexity of code is O(M) where M is length of magazine string.

We can better this. In that method we don’t scan magazine string and ransom note separately but simultaneously. We scan character from ransom note, and check in hash table, if we find good. If not, we scan magazine string till we find the desired character. 
If we reach end of magazine string, return false.
If we reach end of ransom note, return true.


int ransom_note_1(char * magazine, char *ransom){

   char *mag = magazine;
   char *rnote = ransom;
   int hash[256];
  
   while(*rnote != '\0'){
        if(hash[(*rnote)] == 0) {
            while( *mag != '\0' && *rnote != *mag){
                  hash[(*mag)]++;
                  mag++;
             }
             if(*mag == '\0') return false;
             hash[(*rnote)]++;
             mag++;
        }
        hash[(*rnote)]--;
        rnote++;
   }
   return true;
}

 */
