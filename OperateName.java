import java.util.*;


public class OperateName {
	public List<Name> addToList(List<Name> nameList, String name){
		boolean flag = true;
		for(int i = 0; i < nameList.size(); i++){
			if(nameList.get(i).getName().equals(name)){
				nameList.get(i).increase();
				flag = false;
				break;
			}
		}
		if(flag){
			nameList.add(new Name(name));
		}
		return nameList;
	}
	public void showList(List<Name> nameList){
		for(int i = 0; i < nameList.size(); i++){
			System.out.println(nameList.get(i).getName() + " " + 
		nameList.get(i).getCount());
		}
	}
	public List<Name> bubbleSort(List<Name> nameList){
		for(int i = 0; i < nameList.size(); i++){
			for(int j = i; j < nameList.size(); j++){
				if(nameList.get(i).getCount() < 
						nameList.get(j).getCount()){
					Name temp = nameList.get(i);
					nameList.set(i, nameList.get(j));
					nameList.set(j, temp);
				}
			}
		}	
		return nameList;
	}
	public List<Name> removeNotName(List<Name> nameList){
		for(int i = 0; i < nameList.size(); i++){
			switch(nameList.get(i).getName()){
				case "I":
				case "He":
				case "It":
				case "Professor":
				case "They":
				case "Uncle":
				case "You":
				case "The":
					nameList.remove(i);
					i -= 1;
					break;
				default:
					break;
			}
		}
		return nameList;
	}
}
