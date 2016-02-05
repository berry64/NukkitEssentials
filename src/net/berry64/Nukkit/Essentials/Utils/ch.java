package net.berry64.Nukkit.Essentials.Utils;

import java.util.ArrayList;
import java.util.List;

public class ch {
  //Supposed to fix the horrible thing set in Nukkit that if a config does not have a specific value, it returns
  // a new arraylist instead of the null that everyone loves
	public static boolean exists(List<String> l){
		if (l.equals(new ArrayList<>(0))){
			return false;
		}
		return true;
	}
}
