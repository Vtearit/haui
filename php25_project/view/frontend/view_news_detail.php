<div class="col-xs-12 col-md-12">
	<div class="middle">
            <ul class="list-unstyled navtabs">
              <li><h4><?php echo $arr->c_name; ?></h4></li>
            </ul>
            <div class="tab-container"> 
              <!-- chi tiet -->
              <div id="tab1" class="content-tabs">
                <div class="rte">
                  <div style="margin-bottom: 10px;"><img src="public/upload/news/<?php echo $arr->c_img; ?>" style="max-width: 500px;"></div>
                  <div><?php echo $arr->c_description; ?></div>
                  <div><?php echo $arr->c_content; ?></div>
                </div>
              </div>
              <!-- chi tiet --> 
            </div>
          </div>
	</div>          