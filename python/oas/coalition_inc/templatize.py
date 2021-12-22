import typing


def templatize(template: str, variables: typing.Dict[str, any]) -> str:
    for key in variables:
        pattern = f'<{key}>'
        template = template.replace(pattern, str(variables[key]))
    return template


variables = {
    "name": "Mars",
    "pet": "dog",
    "age": 22
}

test_cases = {
    "Hello <name>!": "Hello Mars!",
    "Hello <name>. How is your <pet>": "Hello Mars. How is your dog",
    "Hello <name>! I am <age>": "Hello Mars! I am 22"
}

for template, output in test_cases.items():
    rendered = templatize(template, variables)
    assert rendered == output, f'Expected "{output}" got "{rendered}"'
    

print("All tests passed")