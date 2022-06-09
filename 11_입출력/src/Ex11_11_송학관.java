import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex11_11_송학관 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> words = new HashMap<String, Integer>();
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new FileReader("lyrics.txt"));
			
			String str;
			while((str = br.readLine()) != null) {
				
				String[] wo = str.split(" ");
				for(String w : wo) {
					if(!words.containsKey(w)) {
						words.put(w, 0);
					}
					
					words.put(w, words.get(w) + 1);
				}
			}
			
			Set<String> set = words.keySet();
			Iterator<String> iterator = set.iterator();
			
			while(iterator.hasNext()) {
				String s = iterator.next();
				System.out.println(s + ":" + words.get(s));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

/*
sound:1
Shine:1
hearted:1
yeah:3
when:2
She:1
that:2
wake:1
music:1
There:4
find:1
me:4
let:26
up:1
darkness:1
they:2
still:2
in:4
myself:1
night:1
For:1
tomorrow:1
is:4
it:36
agree:1
my:1
an:4
light:1
And:3
shines:1
be:40
BE:1
Ah:1
comes:2
I:2
wisdom:7
Whisper:4
times:1
see:1
world:1
Mother:2
hour:1
of:11
trouble:1
Mary:2
on:2
broken:1
a:2
chance:1
though:1
may:1
will:5
Living:1
words:7
right:1
people:1
Speaking:3
the:4
standing:1
cloudy:1
When:1
answer:4
there:2
parted:1
Oh:1
Let:10
Yeah:1
until:1
to:3
front:1

*/