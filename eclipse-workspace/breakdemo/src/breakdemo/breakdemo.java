package breakdemo;

class Main 
{public static void main(String[] args) 
{int i = 1;//infinite for loop
for (;; i++) {
	//continue if no doesn't come in tableof 2
	if (i % 2 != 0)
		continue;
	//break if no exceeds 20else 
	if (i > 20)break;
	//print loop variableelse
	System.out.println(i);}}
}

