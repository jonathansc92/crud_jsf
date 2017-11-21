
$('select[name=estado]').change(function () {
    var idEstado = $(this).val();
    $.get('/meuestoque/public/cidades/' + idEstado, function (cidades) {
        $('select[name=cidade]').empty();
        $.each(cidades, function (key, value) {
            $('select[name=cidade]').append('<option value=' + value.id + '>' + value.cidade + '</option>');
        });
    });
});
