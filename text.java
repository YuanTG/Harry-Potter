import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class text {

	public static void main(String[] args) throws FileNotFoundException {
		OperateString os = new OperateString();
		OperateName on = new OperateName();
		File myBook = new File("Harry Potter and the Sorcerer's Stone.txt");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(myBook);
		String content = "";
		while(input.hasNext()){
			content += input.nextLine() + "\n";
		}
		
		String[] contentArray = content.split(" ");
		for(int i = 0; i < contentArray.length; i++){
			contentArray[i] = os.deleteSymbol(contentArray[i]);
		}
		
		List<Name> nameList = new LinkedList<Name>();
		
		for(int i = 0; i < contentArray.length; i++){
			if(os.isACaptalString(contentArray[i])){
				on.addToList(nameList, contentArray[i]);
			}
		}
		nameList = on.removeNotName(nameList);
		nameList = on.bubbleSort(nameList);
		
		
		on.showList(nameList);
	}

}
