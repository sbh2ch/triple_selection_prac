
package com.son.selectionTest.svc;

import org.springframework.ui.Model;

/**
 * <pre>
 * com.son.selectionTest.svc 
 *    |_ AjacService.java
 * 
 * </pre>
 * 
 * @date : 2017. 3. 31. 오후 7:28:59
 * @version :
 * @author : kiost
 */
public interface AjaxService {
	public String getInit();

	public String getFirstSelection(Model model);

	public String getSecondSelection(Model model);

	public String getThirdSelection(Model model);

}
