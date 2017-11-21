//$(document).ready(function () {
//    $(".select").select2({
//        placeholder: "Selecione um estado",
//        allowClear: true
//    });
//});

$("select").select2();


// Form Field required
$(document).ready(function () {
    $('form').parsley();
});

$(document).ready(function () {
    jQuery(function ($) {
        $('.autonumber').autoNumeric('init');
    });
});

$(document).ready(function () {
    $('#datatable').DataTable({
    "language": {
//            "sLengthMenu": "Mostrar _MENU_ registros por p&aacute;gina",
    "sZeroRecords": "Nenhum registro encontrado",
            "sInfo": "Mostrando _START_ / _END_ de _TOTAL_ registro(s)",
//            "sInfoEmpty": "Mostrando 0 / 0 de 0 registros",
            "sInfoFiltered": "(filtrado de _MAX_ registros)",
            "sSearch": "Pesquisar: ",
            "paginate": {
            "previous": "Anterior",
                    "next": "Pr&oacute;ximo"
           }
        }
    });
});