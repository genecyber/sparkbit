/*
 * SparkBit
 *
 * Copyright 2014 Coin Sciences Ltd
 *
 * Licensed under the MIT license (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://opensource.org/licenses/mit-license.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sparkbit;

/**
 * If an event has a payload (it might not) detail in comments next to name of event.
 */
public enum SBEventType {
    ADDRESS_CREATED,	// no payload
    ADDRESS_UPDATED,	// no payload
    TX_CONFIDENCE_CHANGED, // payload is the Transaction object
    JSONRPC_SERVER_STARTED, // no payload
    JSONRPC_SERVER_STOPPED, // no payload
}
