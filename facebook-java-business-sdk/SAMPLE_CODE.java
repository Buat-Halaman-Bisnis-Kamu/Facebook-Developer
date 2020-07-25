/**
 * Copyright (c) 2015-present, Facebook, Inc. All rights reserved.
 *
 * You are hereby granted a non-exclusive, worldwide, royalty-free license to
 * use, copy, modify, and distribute this software in source code or binary
 * form for use in connection with the web services and APIs provided by
 * Facebook.
 *
 * As with any software that integrates with the Facebook platform, your use
 * of this software is subject to the Facebook Developer Principles and
 * Policies [http://developers.facebook.com/policy/]. This copyright notice
 * shall be included in all copies or substantial portions of the software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 */

import com.facebook.ads.sdk.*;
import java.io.File;
import java.util.Arrays;

public class SAMPLE_CODE {
  public static void main (String args[]) throws APIException {

    String access_token = "EAALSnO3gFWEBAM0ZBN3T0QZAZCsRbF3xFRkiwsMcxYOYZBKmTNjPZCB4DGmrLt3VBbqpgOxu5qlfqUFkffIZBKlwmiWHBXd4Btk6bS2OHmoc5LXc5g0IM5zbZCkUSCLIZAzdCSN5u5wErghHShzr9NGQZA1eV2NSry6vKISe4meNChac3WFBzBjIg3ky5AkyADa8ZD";
    String ad_account_id = "648024102411616";
    String app_secret = "b76cb2457ad8838ae628225882c0612c";
    String app_id = "794521401038177";
    APIContext context = new APIContext(access_token).enableDebug(true);

    new AdAccount(ad_account_id, context).getInsights()
      .setTimeRange("{\"since\":\"2020-06-26\",\"until\":\"2020-07-26\"}")
      .setFiltering("[{\"field\":\"delivery_info\",\"operator\":\"IN\",\"value\":[\"pending_review\",\"recently_rejected\",\"rejected\",\"inactive\",\"active\",\"scheduled\",\"completed\",\"recently_completed\"]},{\"field\":\"objective\",\"operator\":\"IN\",\"value\":[\"POST_ENGAGEMENT\",\"REACH\",\"OFFER_CLAIMS\",\"CANVAS_APP_ENGAGEMENT\",\"MOBILE_APP_ENGAGEMENT\",\"LINK_CLICKS\",\"PRODUCT_CATALOG_SALES\",\"MESSAGES\",\"PAGE_LIKES\",\"EVENT_RESPONSES\",\"VIDEO_VIEWS\"]},{\"field\":\"adset.billing_event\",\"operator\":\"IN\",\"value\":[\"IMPRESSIONS\",\"CLICKS\",\"LINK_CLICKS\",\"PAGE_LIKES\",\"POST_ENGAGEMENT\",\"VIDEO_VIEWS\"]},{\"field\":\"adset.optimization_goal\",\"operator\":\"IN\",\"value\":[\"LANDING_PAGE_VIEWS\",\"LINK_CLICKS\",\"PAGE_ENGAGEMENT\",\"PAGE_LIKES\",\"POST_ENGAGEMENT\",\"REACH\",\"REPLIES\",\"SOCIAL_IMPRESSIONS\",\"EVENT_RESPONSES\",\"EXTERNAL\",\"ENGAGED_USERS\",\"CLICKS\",\"AD_RECALL_LIFT\"]}]")
      .setLevel(AdsInsights.EnumLevel.VALUE_ADSET)
      .setBreakdowns(Arrays.asList(AdsInsights.EnumBreakdowns.VALUE_DAYS_1,AdsInsights.EnumBreakdowns.VALUE_PRODUCT_ID,AdsInsights.EnumBreakdowns.VALUE_ACTION_REACTION,AdsInsights.EnumBreakdowns.VALUE_AD_ID))
      .requestField("result_rate")
      .requestField("reach")
      .requestField("results")
      .requestField("quality_score_ectr")
      .requestField("impressions_gross")
      .requestField("impressions_auto_refresh")
      .requestField("delivery")
      .requestField("frequency")
      .requestField("impressions")
      .requestField("cpm")
      .requestField("cpp")
      .execute();
  }
}
