function showSal() {

    var selectValue = $("#jobId").val();

    var realParam = {"jobId" : selectValue}
    $.post("salarybyid.do",realParam,function (data) {
        var  t = eval('('+data+')');
        $('#min_salary').val(t.minSalary);
        $('#max_salary').val(t.maxSalary);
    });



}


function addjob() {

    var temp = $('#addjobform').serialize();

    $.post("../addjob.do",temp,function (data) {
        var  t = eval('('+data+')');
        alert(t.msg);
      //  window.location.href = "/hr/dept.do";

    });

}


function deletejob(id) {

    $.post("deletejob.do",{"jobId":id},function (data) {
        var  t = eval('('+data+')');
        alert(t.msg);

    });

}
function updatejob(id) {


    window.location.href = "showjobbyid.do?jobId="+id;

}


function updateJob() {

    var temp = $('#updatejobform').serialize();

    $.post("updatejob.do",temp, function(data) {

        var t = eval('(' + data + ')');
        alert(t.msg);


    });

}