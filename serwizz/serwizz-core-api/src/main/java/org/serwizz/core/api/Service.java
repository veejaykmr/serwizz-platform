/**
 * 
 */
package org.serwizz.core.api;

import java.util.Map;

/**
 * @author vj
 *
 */
public interface Service{

	/**
	 * 
	 * @param context
	 * @return
	 */
	public Map handle(Context context);
}
