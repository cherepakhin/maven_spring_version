package ru.perm.v.maven_spring256_j11;


import java.util.Objects;

public class HelloDto {
    private Long id = 0L;
    private String name ="-";

    public HelloDto() {
    }

    public HelloDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelloDto helloDto = (HelloDto) o;
        return Objects.equals(id, helloDto.id) && Objects.equals(name, helloDto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
