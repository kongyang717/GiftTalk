package com.qianfeng.android.gifttalk.bean;

import java.util.List;

/**
 * @auther Kong Yang
 * @since 2016/7/5
 */
public class GuideHomeBanner {

    /**
     * code : 200
     * data : {"banners":[{"ad_monitors":[],"channel":"all","id":645,"image_url":"http://img03.liwushuo.com/image/160704/f9jiuu6nl.jpg-w720","order":111,"status":0,"target":{"banner_image_url":"http://img01.liwushuo.com/image/160704/tn3dbn56z.jpg-w300","banner_webp_url":"http://img01.liwushuo.com/image/160704/tn3dbn56z.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img01.liwushuo.com/image/160704/kfjsawoi1.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160704/kfjsawoi1.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1467620984,"id":323,"posts_count":8,"status":1,"subtitle":"女神的泳衣","title":"泳衣选得好，让男神追着跑","updated_at":1467687506},"target_id":323,"target_type":"url","target_url":"liwushuo:///page?page_action=navigation&login=false&type=topic&topic_id=323","type":"collection","webp_url":"http://img03.liwushuo.com/image/160704/f9jiuu6nl.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"channel":"all","id":640,"image_url":"http://img01.liwushuo.com/image/160624/n4ynnar4r.jpg-w720","order":110,"status":0,"target":{"banner_image_url":"http://img03.liwushuo.com/image/160513/4m3a7gr3h.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160513/4m3a7gr3h.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img02.liwushuo.com/image/160513/q8sq2pv5y.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160513/q8sq2pv5y.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1463140550,"id":281,"posts_count":12,"status":1,"subtitle":"防晒有道","title":"不想被\u201c黑\u201d，做好防晒才是正经事","updated_at":1467012462},"target_id":281,"target_type":"url","target_url":"liwushuo:///page?page_action=navigation&login=false&type=topic&topic_id=281","type":"collection","webp_url":"http://img01.liwushuo.com/image/160624/n4ynnar4r.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"channel":"all","id":624,"image_url":"http://img02.liwushuo.com/image/160612/yk96kkhwh.jpg-w720","order":106,"status":0,"target":{"banner_image_url":"http://img03.liwushuo.com/image/160612/bne4jt8de.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160612/bne4jt8de.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img03.liwushuo.com/image/160612/hrijyoodp.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160612/hrijyoodp.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1465733246,"id":310,"posts_count":8,"status":1,"subtitle":"还有眼前的零食啊","title":"生活不止有诗和远方","updated_at":1466566218},"target_id":310,"target_type":"url","target_url":"liwushuo:///page?page_action=navigation&login=false&type=topic&topic_id=310","type":"collection","webp_url":"http://img02.liwushuo.com/image/160612/yk96kkhwh.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"channel":"all","id":641,"image_url":"http://img03.liwushuo.com/image/160624/rfutnj8l0.jpg-w720","order":105,"status":0,"target":{"banner_image_url":"http://img01.liwushuo.com/image/160624/1fcbha8yr.jpg-w300","banner_webp_url":"http://img01.liwushuo.com/image/160624/1fcbha8yr.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img03.liwushuo.com/image/160624/0bsd3db8f.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160624/0bsd3db8f.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1466734797,"id":320,"posts_count":7,"status":1,"subtitle":"你没有的安全感，让爱的礼物来给","title":"巨蟹座生日礼物","updated_at":1466734936},"target_id":320,"target_type":"url","target_url":"liwushuo:///page?page_action=navigation&login=false&type=topic&topic_id=320","type":"collection","webp_url":"http://img03.liwushuo.com/image/160624/rfutnj8l0.jpg?imageView2/2/w/720/q/85/format/webp"}]}
     * message : OK
     */

    private int code;
    private DataBean data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * ad_monitors : []
         * channel : all
         * id : 645
         * image_url : http://img03.liwushuo.com/image/160704/f9jiuu6nl.jpg-w720
         * order : 111
         * status : 0
         * target : {"banner_image_url":"http://img01.liwushuo.com/image/160704/tn3dbn56z.jpg-w300","banner_webp_url":"http://img01.liwushuo.com/image/160704/tn3dbn56z.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img01.liwushuo.com/image/160704/kfjsawoi1.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160704/kfjsawoi1.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1467620984,"id":323,"posts_count":8,"status":1,"subtitle":"女神的泳衣","title":"泳衣选得好，让男神追着跑","updated_at":1467687506}
         * target_id : 323
         * target_type : url
         * target_url : liwushuo:///page?page_action=navigation&login=false&type=topic&topic_id=323
         * type : collection
         * webp_url : http://img03.liwushuo.com/image/160704/f9jiuu6nl.jpg?imageView2/2/w/720/q/85/format/webp
         */

        private List<BannersBean> banners;

        public List<BannersBean> getBanners() {
            return banners;
        }

        public void setBanners(List<BannersBean> banners) {
            this.banners = banners;
        }

        public static class BannersBean {
            private String channel;
            private int id;
            private String image_url;
            private int order;
            private int status;
            /**
             * banner_image_url : http://img01.liwushuo.com/image/160704/tn3dbn56z.jpg-w300
             * banner_webp_url : http://img01.liwushuo.com/image/160704/tn3dbn56z.jpg?imageView2/2/w/300/q/85/format/webp
             * cover_image_url : http://img01.liwushuo.com/image/160704/kfjsawoi1.jpg-w720
             * cover_webp_url : http://img01.liwushuo.com/image/160704/kfjsawoi1.jpg?imageView2/2/w/720/q/85/format/webp
             * created_at : 1467620984
             * id : 323
             * posts_count : 8
             * status : 1
             * subtitle : 女神的泳衣
             * title : 泳衣选得好，让男神追着跑
             * updated_at : 1467687506
             */

            private TargetBean target;
            private int target_id;
            private String target_type;
            private String target_url;
            private String type;
            private String webp_url;
            private List<?> ad_monitors;

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public int getOrder() {
                return order;
            }

            public void setOrder(int order) {
                this.order = order;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public TargetBean getTarget() {
                return target;
            }

            public void setTarget(TargetBean target) {
                this.target = target;
            }

            public int getTarget_id() {
                return target_id;
            }

            public void setTarget_id(int target_id) {
                this.target_id = target_id;
            }

            public String getTarget_type() {
                return target_type;
            }

            public void setTarget_type(String target_type) {
                this.target_type = target_type;
            }

            public String getTarget_url() {
                return target_url;
            }

            public void setTarget_url(String target_url) {
                this.target_url = target_url;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getWebp_url() {
                return webp_url;
            }

            public void setWebp_url(String webp_url) {
                this.webp_url = webp_url;
            }

            public List<?> getAd_monitors() {
                return ad_monitors;
            }

            public void setAd_monitors(List<?> ad_monitors) {
                this.ad_monitors = ad_monitors;
            }

            public static class TargetBean {
                private String banner_image_url;
                private String banner_webp_url;
                private String cover_image_url;
                private String cover_webp_url;
                private int created_at;
                private int id;
                private int posts_count;
                private int status;
                private String subtitle;
                private String title;
                private int updated_at;

                public String getBanner_image_url() {
                    return banner_image_url;
                }

                public void setBanner_image_url(String banner_image_url) {
                    this.banner_image_url = banner_image_url;
                }

                public String getBanner_webp_url() {
                    return banner_webp_url;
                }

                public void setBanner_webp_url(String banner_webp_url) {
                    this.banner_webp_url = banner_webp_url;
                }

                public String getCover_image_url() {
                    return cover_image_url;
                }

                public void setCover_image_url(String cover_image_url) {
                    this.cover_image_url = cover_image_url;
                }

                public String getCover_webp_url() {
                    return cover_webp_url;
                }

                public void setCover_webp_url(String cover_webp_url) {
                    this.cover_webp_url = cover_webp_url;
                }

                public int getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(int created_at) {
                    this.created_at = created_at;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getPosts_count() {
                    return posts_count;
                }

                public void setPosts_count(int posts_count) {
                    this.posts_count = posts_count;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getSubtitle() {
                    return subtitle;
                }

                public void setSubtitle(String subtitle) {
                    this.subtitle = subtitle;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(int updated_at) {
                    this.updated_at = updated_at;
                }
            }
        }
    }
}
