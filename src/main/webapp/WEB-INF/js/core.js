/**
 * 
 */
var core={
	timestampToTime:function(timestamp){
		var date = new Date(timestamp);
		Y = date.getFullYear() + '-';
        M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
        D = date.getDate() + ' ';
        return Y+M+D;
	},
	 cstTotime:function(date){

	    return date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDay();

	}
};