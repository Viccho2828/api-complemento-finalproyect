$(document).on("click","#btnagregar",function(){
    $("#txtnombreproducto").val("");
    $("#txtprecioproducto").val("");
    $("#switchproducto").hide();
    $("#cbactivo").prop("checked",false);
    $("#hddcodprod").val("0");
    $("#cbocategoria").empty();
    $("#cboproveedor").empty();
    listarCatProduc($(this).attr("data-prodcat"),$(this).attr("data-prodprove"));

    $("#modalproducto").modal("show");
})


$(document).on("click",".btnactualizar",function(){
    $("#txtnombreproducto").val($(this).attr("data-prodnom"));
    $("#txtprecioproducto").val($(this).attr("data-prodprecio"));
    $("#switchproducto").show();
    if ($(this).attr("data-prodactivo")==="true"){
        $("#cbactivo").prop("checked",true);
    }else{
        $("#cbactivo").prop("checked",false);
    }
    $("#hddcodprod").val($(this).attr("data-prodcode"));
    $("#cbocategoria").empty();
    $("#cboproveedor").empty();
    listarCatProduc($(this).attr("data-prodcat"),$(this).attr("data-prodprove"));

    $("#modalproducto").modal("show");
});


$(document).on("click","#btnguardar",function(){
    $.ajax({
        type:"POST",
        url:"/producto/registrar",
        contentType:"application/json",
        data: JSON.stringify({
            codproducto: $("#hddcodprod").val(),
            nombreprod: $("#txtnombreproducto").val(),
            precioprod: $("#txtprecioproducto").val(),
            codproveedor: $("#cboproveedor").val(),
            codcategoria: $("#cbocategoria").val(),
            activo: $("#cbactivo").prop("checked"),
        }),
        success: function(resultado){
            alert(resultado.mensaje)
        }
    });
    $("#modalproducto").modal("hide")
});



function listarCatProduc(idcate,idprod){
    $.ajax({
    type:"GET",
    url:"/categoria/listar",
    dataType:"json",
    success:function(resultado){
        $.each(resultado,function(index,value){
            $("#cbocategoria").append(`<option value="${value.codcategoria}">${value.nombrecategoria}</option>`)
        });
        if(idcate > 0)
            $("#cbocategoria").val(idcate);


        $.ajax({
            type:"GET",
            url:"/proveedor/listar",
            dataType:"json",
            success:function(resultado){
                $.each(resultado,function(index,value){
                    $("#cboproveedor").append(`<option value="${value.codproveedor}">${value.razonsocial}</option>`)
                });
                if(idprod > 0)
                    $("#cboproveedor").val(idprod);

            }
            })

    }
    });
}