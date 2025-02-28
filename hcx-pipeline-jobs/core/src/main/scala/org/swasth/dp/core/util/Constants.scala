package org.swasth.dp.core.util

object Constants {

  // APIs
  val PARTICIPANT_CREATE = "/participant/create"
  val PARTICIPANT_DELETE = "/participant/delete"
  val CLAIM_SUBMIT = "/claim/submit"
  val CLAIM_ONSUBMIT = "/claim/on_submit"
  val NOTIFICATION_SUBSCRIPTION_UPDATE = "/notification/subscription/update"
  val NOTIFICATION_NOTIFY = "/notification/notify"

  val CDATA = "cdata"
  val EDATA = "edata"
  val SENDER = "sender"
  val RECIPIENT = "recipient"
  val PROTECTED = "protected"
  val ENCRYPTED_KEY = "encrypted_key"
  val IV = "iv"
  val CIPHERTEXT = "ciphertext"
  val TAG = "tag"
  val PAYLOAD_LENGTH = 5
  val MID = "mid"
  val PAYLOAD = "payload"
  val ETS = "ets"
  val ACTION = "action"
  val HEADERS = "headers"
  val JOSE = "jose"
  val PROTOCOL = "protocol"
  val DOMAIN = "domain"
  val LOG_DETAILS = "log_details"
  val HCX_ERROR_DETAILS = "x-hcx-error_details"
  val DEBUG_DETAILS = "x-hcx-debug_details"
  val CODE = "code"
  val MESSAGE = "message"
  val TRACE = "trace"
  val SUBMITTED = "submitted"
  val EID = "eid"
  val END_POINT = "endpoint_url"
  val STATUS = "status"
  val REQUESTED_TIME = "requestTimeStamp"
  val UPDATED_TIME = "updatedTimestamp"
  val SENDER_ROLE = "senderRole"
  val RECIPIENT_ROLE = "recipientRole"
  val ROLES = "roles"
  val RETRY_INDEX = "retryIndex"
  val TYPE = "type"
  val BROADCAST = "Broadcast"
  val RECIPIENT_ID = "recipientId"
  val PARTICIPANT_CODE = "participant_code"
  val TEMPLATE = "template"
  val PARTICIPANTS = "participants"
  val PARTICIPANT_SEARCH = "/v1/participant/search"
  val NAME = "name"
  val AUDIT = "AUDIT"
  val TOTAL_DISPATCHES = "totalDispatches"
  val SUCCESSFUL_DISPATCHES = "successfulDispatches"
  val FAILED_DISPATCHES = "failedDispatches"
  val RESULT_DETAILS = "resultDetails"
  val INVALID_STATUS = List("Inactive", "Blocked")
  val VALID_STATUS = List("Created", "Active")
  val ACTIVE = "Active"
  val ENTITY_TYPE = "entity_type"

  //Event Fields
  val HCX_SENDER_CODE = "x-hcx-sender_code"
  val HCX_RECIPIENT_CODE = "x-hcx-recipient_code"
  val API_CALL_ID = "x-hcx-api_call_id"
  val HCX_CORRELATION_ID = "x-hcx-correlation_id"
  val WORKFLOW_ID = "x-hcx-workflow_id"
  val HCX_TIMESTAMP = "x-hcx-timestamp"
  val TIMESTAMP = "timestamp"
  val DEBUG_FLAG = "x-hcx-debug_flag"
  val HCX_STATUS = "x-hcx-status"
  val NOTIFICATION_HEADERS = "x-hcx-notification_headers"
  val TOPIC_CODE = "topic_code"
  val EXPIRY = "expiry"
  val TITLE = "title"
  val DESCRIPTION = "description"
  val NOTIFICATION_REQ_ID = "notification_request_id"
  val NOTIFICATION_DATA = "notification_data"
  val SUBSCRIPTIONS = "subscriptions"
  val SUBSCRIPTION_ID = "subscription_id"
  val SUBSCRIPTION_REQUEST_ID = "subscription_id"
  val RECIPIENT_CODE = "recipient_code"
  val SENDER_CODE = "sender_code"
  val RECIPIENT_CODES = "recipient_codes"
  val RECIPIENT_ROLES = "recipient_roles"
  val SUBSCRIPTION_STATUS = "subscription_status"
  val ALLOWED_RECIPIENTS = "allowed_recipients"
  val CATEGORY = "category"
  val NETWORK = "Network"
  val ERROR_DETAILS = "error_details"
  val ERROR_STATUS = "response.error"
  val DISPATCH_STATUS = "request.dispatched"
  val QUEUED_STATUS = "request.queued"
  val REQ_RETRY = "request.retry"
  val INPUT_EVENT = "inputEvent"
  val MASTER_DATA = "masterData"
  val RESOLVED_TEMPLATE = "resolvedTemplate"
  val PARTICIPANT_DETAILS = "participantDetails"
  val OBJECT = "object"
  val ID = "id"
  val PARTICIPANT_NAME = "participant_name"
  val HCX_NAME = "hcx_name"
  val DDMMYYYY = "DDMMYYYY"
  val WORKFLOW = "Workflow"
  val PROPERTIES = "properties"
  val PROPS = "props"
  val RECIPIENT_TYPE = "recipient_type"
  val SUBSCRIPTION = "subscription"
  val PARTICIPANT_ROLE = "participant_role"
  val RECIPIENTS = "recipients"
  val CORRELATIONID = "correlation_id"

  // Notification topic codes
  val PARTICIPANT_ONBOARD = "notif-participant-onboarded"
  val CLAIM_INITIATED = "notif-claim-initiation"
  val CLAIM_CLOSURE = "notif-claim-closure"
  val SUBSCRIPTION_UPDATE = "notif-subscription-update"

  //Search Fields
  val SEARCH_REQUEST = "x-hcx-search"
  val SEARCH_RESPONSE = "x-hcx-search_response"
  val SEARCH_FILTERS = "filters"
  val SEARCH_FILTERS_RECEIVER = "receivers"
  val SEARCH_COUNT = "count"
  val SEARCH_ENTITY_COUNT = "entity_counts"
  val PARTIAL_RESPONSE = "response.partial"
  val COMPLETE_RESPONSE = "response.complete"
  val REQUEST_INITIATED = "request.initiated"


  val OPEN_STATUS = "OPEN"
  val RETRY_STATUS = "RETRY"
  val CLOSE_STATUS = "CLOSE"
  val PARTIAL_STATUS = "PARTIAL"
  val FAIL_STATUS = "FAIL"
  //val DISPATCH_STATUS = "request.dispatched"
  //val ERROR_STATUS = "response.error"

  val ERR_INVALID_RECIPIENT = "ERR_INVALID_RECIPIENT"
  val ERR_NOTIFICATION_EXPIRED = "ERR_NOTIFICATION_EXPIRED"
  val RECIPIENT_ERROR_CODE = "ERR_RECIPIENT_NOT_AVAILABLE"
  val RECIPIENT_ERROR_MESSAGE = "Please provide correct recipient code"
  val RECIPIENT_ERROR_LOG = "Recipient endpoint url is empty"

  // JWT token properties
  val JTI = "jti"
  val ISS = "iss"
  val SUB = "sub"
  val IAT = "iat"
  val EXP = "exp"
  val TYP = "typ"
  val JWT = "JWT"
  val ALG = "alg"
  val RS256 = "RS256"


  val NOTIFICATION_SUBSCRIBE = "/notification/subscribe"
  val NOTIFICATION_UNSUBSCRIBE = "/notification/unsubscribe"
  val NOTIFICATION_ONSUBSCRIBE = "/notification/on_subscribe"
  val SENDER_LIST = "sender_list"
  val SUBSCRIPTION_MAP = "subscription_map"
}
