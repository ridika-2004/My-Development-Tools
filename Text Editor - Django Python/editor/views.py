from django.shortcuts import render
from .models import Document

def editor(request):
    # Get or create a single document instance
    document, created = Document.objects.get_or_create(pk=1)
    return render(request, 'editor/index.html', {'document': document})