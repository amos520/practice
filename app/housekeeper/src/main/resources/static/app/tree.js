$(function (){
    var tree =[];
    $.ajax({
        async:false,
        type: "POST",
        dataType:"json",
        url: "/tree",
        success: function(data){
            //var tree = "[{\"text\":\"fff\"}]";
        	var d =[];
        	d.push(data);
        	 console.log("data:"+typeof(d));
            $('#tree1').treeview({
            	data:d,
            	showTags:true,
            	nodeIcon: 'glyphicon glyphicon-user',
            	});
           
        }
    });

    var tree = [
        {
            text: "Parent 1",
            nodes: [
                {
                    text: "Child 1",
                    nodes: [
                        {
                            text: "Grandchild 1"
                        },
                        {
                            text: "Grandchild 2"
                        }
                    ]
                },
                {
                    text: "Child 2"
                }
            ]
        }
    ];
    console.log("tree:"+typeof(tree));
    $('#tree').treeview({data:tree});


});

