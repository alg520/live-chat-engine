/*
 * Copyright 2015 Evgeny Dolganov (evgenij.dolganov@gmail.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package och.chat.web.servlet.system_api.chat;

import java.util.Map;

import och.api.model.BaseBean;
import och.api.model.ValidationProcess;
import och.api.model.chat.ChatUpdateData;

public class AccsUpdatesReq extends BaseBean {
	
	public static class AccUpdateReq {
		public Map<String, ChatUpdateData> chats; //[chatId - lastData]
		public Boolean opActive;
		public Integer activeCount;
	}
	
	public boolean compact;
	public Map<String, AccUpdateReq> updates;
	

	@Override
	protected void checkState(ValidationProcess v) {
		v.checkForEmpty(updates, "updates");
	}

}